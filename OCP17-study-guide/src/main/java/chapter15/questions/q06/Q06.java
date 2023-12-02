package chapter15.questions.q06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q06 {

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("");

        conn.setAutoCommit(true);
        String sql = "INSERT INTO games VALUES(3, Jenga);";
        try (PreparedStatement ps = conn.prepareStatement(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)) {
            ps.executeUpdate();
        }
        conn.rollback();
    }
}
