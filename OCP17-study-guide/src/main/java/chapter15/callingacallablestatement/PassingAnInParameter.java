package chapter15.callingacallablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
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
