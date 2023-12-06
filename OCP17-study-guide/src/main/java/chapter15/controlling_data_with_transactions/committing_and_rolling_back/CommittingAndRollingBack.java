package chapter15.controlling_data_with_transactions.committing_and_rolling_back;

import java.sql.*;
import java.util.HashMap;

public class CommittingAndRollingBack {


    public static void main(String[] args) throws SQLException {


        try (Connection conn =
                     DriverManager.getConnection("jdbc:hsqldb:file:zoo")) {
            conn.setAutoCommit(false);
            var elephantRowsUpdated = updateRow(conn, 5, "African Elephant");
            var zebraRowsUpdated = updateRow(conn, -5, "Zebra");

            System.out.println("elephantRowsUpdated : " + elephantRowsUpdated);
            System.out.println("zebraRowsUpdated : " + zebraRowsUpdated);

            if (!elephantRowsUpdated || !zebraRowsUpdated)
                conn.rollback();
            else {
                String selectSql = """
                        SELECT COUNT(*)
                        FROM exhibits
                        WHERE num_acres <= 0""";

                try (PreparedStatement ps = conn.prepareStatement(selectSql); ResultSet rs = ps.executeQuery()) {
                    rs.next();
                    int count = rs.getInt(1);
                    if (count == 0) {
                        System.out.println("Commit...");
                        conn.commit();
                    } else {
                        System.out.println("Rollback....");
                        conn.rollback();
                    }
                }
            }

            String sql = "SELECT  name , num_acres FROM exhibits";
            var map = new HashMap<String, Double>();

            try (var ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    String name = rs.getString(1);
                    Double numAcres = rs.getDouble(2);
                    map.put(name,numAcres);
                }
                System.out.println(map);
            }
        }
    }

    private static boolean updateRow(Connection conn, int numToAdd, String name)
            throws SQLException {
        String updateSql = """
                UPDATE exhibits
                SET num_acres = num_acres + ? WHERE name = ?""";
        try (PreparedStatement ps = conn.prepareStatement(updateSql)) {
            ps.setInt(1, numToAdd);
            ps.setString(2, name);
            return ps.executeUpdate() > 0;
        }
    }
}
