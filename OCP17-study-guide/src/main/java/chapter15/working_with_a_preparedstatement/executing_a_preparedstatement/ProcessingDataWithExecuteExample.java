package chapter15.working_with_a_preparedstatement.executing_a_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProcessingDataWithExecuteExample {

    public static void main(String[] args) throws SQLException {
        test();
    }

    static void test() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        var sql = "SELECT * FROM exhibits";

        try (var ps = conn.prepareStatement(sql)) { // work with rs

            boolean isResultSet = ps.execute();
            if (isResultSet) {
                try (ResultSet rs = ps.getResultSet()) {
                    System.out.println("ran a query");
                }
            } else {
                int result = ps.getUpdateCount();
                System.out.println("ran an update");
            }
        }

    }
}
