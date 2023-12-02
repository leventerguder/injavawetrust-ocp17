package chapter15.questions.q08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q08 {

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("");

        var sql = "call learn()";
        try (var cs = conn.prepareCall(sql)) {
            cs.setString(1, "java");
            try (var rs = cs.executeQuery()) {
                while (rs.next()) System.out.println(rs.getString(3));
            }
        }
    }
}
