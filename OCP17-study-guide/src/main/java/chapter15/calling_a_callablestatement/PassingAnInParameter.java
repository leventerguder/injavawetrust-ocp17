package chapter15.calling_a_callablestatement;

import java.sql.Connection;
import java.sql.SQLException;

public class PassingAnInParameter {

    Connection conn = null;

    void test() throws SQLException {

        var sql = "{call read_names_by_letter(?)}";
        try (var cs = conn.prepareCall(sql)) {
            cs.setString("prefix", "Z");
            try (var rs = cs.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString(3));
                }
            }
        }
    }
}
