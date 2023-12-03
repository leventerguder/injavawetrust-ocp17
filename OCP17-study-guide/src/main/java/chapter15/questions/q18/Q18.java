package chapter15.questions.q18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q18 {

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("");

        String insert = "INSERT INTO species VALUES (3, 'Ant', .05)";
        String select = "SELECT count(*) FROM species";
        try (var ps = conn.prepareStatement(insert)) {
            ps.executeUpdate();
        }
        try (var ps = conn.prepareStatement(select)) {
            var rs = ps.executeQuery();
            System.out.println(rs.getInt(1));
        }

    }
}
