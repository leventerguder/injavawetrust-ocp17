package chapter15.gettingdatafromaresultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class ReadingAResultSet {

    void test() throws SQLException {

        Connection conn = DriverManager.getConnection("");

        String sql = "SELECT id, name FROM exhibits";
        var idToNameMap = new HashMap<Integer, String>();

        try (var ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                idToNameMap.put(id, name);
            }
            System.out.println(idToNameMap);
        }
    }
}
