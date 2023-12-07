package chapter15.questions.q16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q16 {

    public static void optionE() throws SQLException {

        Connection conn = DriverManager.getConnection("");

        var sql = "INSERT INTO toys VALUES (?, ?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setObject(3, "red");
            ps.setInt(2, 8);
            ps.setString(1, "ball");
            ps.executeUpdate();
        }
    }
}
