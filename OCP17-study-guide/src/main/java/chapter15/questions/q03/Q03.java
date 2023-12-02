package chapter15.questions.q03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q03 {

    public static void main(String[] args) throws SQLException {


        Connection conn = DriverManager.getConnection("");

        var sql = """
                UPDATE habitat SET environment = null WHERE environment = ? """;
        try (var ps = conn.prepareStatement(sql)) {
            ps.setString(1, "snow");
            ps.setString(1, "snow");
            ps.executeUpdate();
        }
    }
}
