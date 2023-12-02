package chapter15.questions.q12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q12 {

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("");

        var sql = "SELECT num FROM counts WHERE num> ?";
        try (var ps = conn.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
            ps.setInt(1, 3);
            try (var rs = ps.executeQuery()) {
                while (rs.next())
                    System.out.println(rs.getObject(1));
            }
            ps.setInt(1, 100);
            try (var rs = ps.executeQuery()) {
                while (rs.next())
                    System.out.println(rs.getObject(1));
            }
        }

    }
}
