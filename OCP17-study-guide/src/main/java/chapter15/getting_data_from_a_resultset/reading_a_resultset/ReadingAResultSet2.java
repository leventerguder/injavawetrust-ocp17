package chapter15.getting_data_from_a_resultset.reading_a_resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class ReadingAResultSet2 {

    public static void main(String[] args) throws SQLException {
        executeQueryMethod();
    }

    static void executeQueryMethod() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        String sql = "SELECT id, name FROM exhibits";
        var idToNameMap = new HashMap<Integer, String>();

        try (var ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                idToNameMap.put(id, name);
            }
            System.out.println(idToNameMap);
        }
    }
}
