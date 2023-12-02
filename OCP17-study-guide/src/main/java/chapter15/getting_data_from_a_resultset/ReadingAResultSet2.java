package chapter15.getting_data_from_a_resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ReadingAResultSet2 {

    void test() throws SQLException {

        Connection conn = DriverManager.getConnection("");

        var sql = "SELECT count(*) FROM exhibits";
        try (var ps = conn.prepareStatement(sql); var rs = ps.executeQuery()) {
            if (rs.next()) {
                int count = rs.getInt(1);
                System.out.println(count);
            }
        }
    }

    void test2() throws SQLException {

        Connection conn = DriverManager.getConnection("");

        var sql = "SELECT count(*) AS count FROM exhibits";
        try (var ps = conn.prepareStatement(sql);
             var rs = ps.executeQuery()) {
            if (rs.next()) {
                var count = rs.getInt("total");
                System.out.println(count);
            }
        }
    }

    void test3() throws SQLException {

        Connection conn = DriverManager.getConnection("");

        var sql = "SELECT * FROM exhibits where name='Not in table'";
        try (var ps = conn.prepareStatement(sql); var rs = ps.executeQuery()) {
            rs.next();
            rs.getInt(1); // SQLException
        }
    }

    void test4() throws SQLException {

        Connection conn = DriverManager.getConnection("");


        var sql = "SELECT count(*) FROM exhibits";
        try (var ps = conn.prepareStatement(sql); var rs = ps.executeQuery()) {
            rs.getInt(1); // SQLException
        }
    }
}
