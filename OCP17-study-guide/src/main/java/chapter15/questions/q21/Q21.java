package chapter15.questions.q21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q21 {

    public static void optionBD() throws SQLException {

        Connection conn = DriverManager.getConnection("");

        try (conn) {
            conn.setAutoCommit(false);
            String sql = "INSERT INTO exhibits VALUES(3, 'Test', 2)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.executeUpdate();
            }
            conn.setAutoCommit(true);  // line W

            // The code starts with autocommit off. As written, we turn autocommit mode back on
            // and immediately commit the transaction.

            // When line W is commented out the update gets lost
        }
    }
}