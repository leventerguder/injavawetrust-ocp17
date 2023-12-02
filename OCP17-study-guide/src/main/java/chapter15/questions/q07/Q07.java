package chapter15.questions.q07;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Q07 {

    public static void main(String[] args) throws SQLException {
        var sql = "UPDATE names SET name = 'Animal'";
        try (var conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
             var ps = conn.prepareStatement(sql)) {
            var result = ps.executeUpdate();
            System.out.println(result);
        }
    }
}
