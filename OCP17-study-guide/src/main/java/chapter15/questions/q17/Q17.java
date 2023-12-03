package chapter15.questions.q17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q17 {

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("");

        var sql = "SELECT num FROM counts WHERE num> ?";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, 3);
            try (var rs = ps.executeQuery()) {
                while (rs.next())
                    System.out.println(rs.getObject(1));
            }
            try (var rs = ps.executeQuery()) {
                while (rs.next())
                    System.out.println(rs.getObject(1));
            }
        }
    }
}
