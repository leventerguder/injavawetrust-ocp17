package chapter15.closing_database_resources;

import java.sql.DriverManager;
import java.sql.SQLException;

public class WritingAResourceLeakExample {

    public void bad() throws SQLException {
        var url = "jdbc:hsqldb:zoo";
        var sql = "SELECT not_a_column FROM names";
        var conn = DriverManager.getConnection(url);
        var ps = conn.prepareStatement(sql);
        var rs = ps.executeQuery();

        // Suppose an exception is thrown on line 13 (ps.executeQuery()).
        // The try-with-resources block is never entered,
        // so we don’t benefit from automatic resource closing.
        // That means this code has a resource leak if it fails.
        // Do not write code like this

        try (conn; ps; rs) {
            while (rs.next())
                System.out.println(rs.getString(1));
        }
    }
}
