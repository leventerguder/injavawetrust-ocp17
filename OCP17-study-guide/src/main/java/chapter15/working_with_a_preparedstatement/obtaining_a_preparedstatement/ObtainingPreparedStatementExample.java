package chapter15.working_with_a_preparedstatement.obtaining_a_preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ObtainingPreparedStatementExample {


    public static void main(String[] args) throws SQLException {
        test1();
    }

    static void test1() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM exhibits")) {

            System.out.println(ps);
        }

    }

    void test2() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        // try (var ps = conn.prepareStatement()) { // DOES NOT COMPILE }

        // Passing a SQL statement when creating the object is mandatory!
    }
}
