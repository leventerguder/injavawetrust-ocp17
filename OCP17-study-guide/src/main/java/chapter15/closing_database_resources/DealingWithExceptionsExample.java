package chapter15.closing_database_resources;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DealingWithExceptionsExample {

    public static void main(String[] args) {

        var sql = "SELECT not_a_column FROM names";
        var url = "jdbc:hsqldb:zoo";
        try (var conn = DriverManager.getConnection(url);
             var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {

            while (rs.next())
                System.out.println(rs.getString(1));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }
}
