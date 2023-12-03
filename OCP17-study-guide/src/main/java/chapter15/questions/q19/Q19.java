package chapter15.questions.q19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q19 {

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("");

        var sql = "UPDATE habitat WHERE environment = ?";
        try (var ps = conn.prepareCall(sql)) {

            ps.executeUpdate();
        }
    }
}
