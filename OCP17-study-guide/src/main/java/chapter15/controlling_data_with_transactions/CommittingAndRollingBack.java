package chapter15.controlling_data_with_transactions;

import java.sql.*;

public class CommittingAndRollingBack {


    public static void main(String[] args) throws SQLException {


        try (Connection conn =
                     DriverManager.getConnection("jdbc:hsqldb:file:zoo")) {
            conn.setAutoCommit(false);
            var elephantRowsUpdated = updateRow(conn, 5, "African Elephant");
            var zebraRowsUpdated = updateRow(conn, -5, "Zebra");
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
                    if (count == 0)
                        conn.commit();
                    else
                        conn.rollback();
                }
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
