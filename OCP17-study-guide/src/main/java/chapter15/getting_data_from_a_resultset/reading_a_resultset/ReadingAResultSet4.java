package chapter15.getting_data_from_a_resultset.reading_a_resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ReadingAResultSet4 {

    public static void main(String[] args) throws SQLException {

        test();
    }

    static void test() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        var sql = "SELECT count(*) AS count FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            if (rs.next()) {
                var count = rs.getInt("total");
                // java.sql.SQLException: Column not found: total
                System.out.println(count);
            }
        }
    }

}
