package chapter15.working_with_a_preparedstatement.executing_a_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModifyingDataWithExecuteUpdateExample {

    public static void main(String[] args) throws SQLException {

        test1();
    }

    static void test1() throws SQLException {

        var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
        var updateSql = "UPDATE exhibits SET name = '' " + "WHERE name = 'None'";
        var deleteSql = "DELETE FROM exhibits WHERE id = 10";

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        try (var ps = conn.prepareStatement(insertSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 1
        }

        try (var ps = conn.prepareStatement(updateSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 0
        }

        try (var ps = conn.prepareStatement(deleteSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 1
        }
    }
}
