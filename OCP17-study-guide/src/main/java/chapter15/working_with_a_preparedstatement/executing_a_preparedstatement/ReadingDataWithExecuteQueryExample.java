package chapter15.working_with_a_preparedstatement.executing_a_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadingDataWithExecuteQueryExample {


    public static void main(String[] args) throws SQLException {
        test();
    }

    static void test() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        var sql = "SELECT * FROM exhibits";
        try (var ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            System.out.println(ps);
            System.out.println(ps.getClass());

            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println(id + " " + name);
            }
        }

    }
}
