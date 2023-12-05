package chapter15.getting_data_from_a_resultset.reading_a_resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ReadingAResultSet5 {

    public static void main(String[] args) throws SQLException {

        test();
    }
    static void test() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        var sql = "SELECT * FROM exhibits where name='Not in table'";
        try (var ps = conn.prepareStatement(sql); var rs = ps.executeQuery()) {
            rs.next();
            rs.getInt(1); // SQLException
            //  invalid cursor state: identifier cursor not positioned on row in
            //  UPDATE, DELETE, SET, or GET statement: ; ResultSet is empty
        }
    }
}
