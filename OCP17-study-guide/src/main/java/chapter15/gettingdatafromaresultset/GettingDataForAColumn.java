package chapter15.gettingdatafromaresultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GettingDataForAColumn {

    void test() throws SQLException {

        Connection conn = DriverManager.getConnection("");

        var sql = "SELECT id, name FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            while (rs.next()) {
                Object idField = rs.getObject("id");
                Object nameField = rs.getObject("name");
                if (idField instanceof Integer id)
                    System.out.println(id);
                if (nameField instanceof String name)
                    System.out.println(name);
            }
        }


    }
}
