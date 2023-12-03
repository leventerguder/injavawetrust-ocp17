package chapter15.questions.q14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q14 {


    public static void main(String[] args) throws SQLException {


        Connection conn = DriverManager.getConnection("");

        var sql = "{?= call learn(?)}";
        try (var cs = conn.prepareCall(sql)) {
            cs.setInt(1, 8);
            cs.execute();
            System.out.println(cs.getInt(1));
        }
    }
}
