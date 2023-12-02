package chapter15.questions.q10;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Q10 {


    public static void main(String[] args) throws SQLException {
        var sql = "UPDATE food SET amount = amount + 1";
        try (var conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
             var ps = conn.prepareStatement(sql)) {
            var result = ps.executeUpdate();
            System.out.println(result);
        }
    }

}
