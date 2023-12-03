package chapter15.working_with_a_preparedstatement.executing_a_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsingTheCorrectMethodExample {

    public static void main(String[] args) throws SQLException {
        test();
    }

    static void test() throws SQLException {
        var sql = "SELECT * FROM names";
        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
        try (var ps = conn.prepareStatement(sql)) {
            var result = ps.executeUpdate();
            // java.sql.SQLException: statement does not generate a row count
        }

    }
}
