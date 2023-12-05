package chapter15.calling_a_callablestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PassingAnInParameter {

    public static void main(String[] args) throws SQLException {
        test();
    }

    static void test() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

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
