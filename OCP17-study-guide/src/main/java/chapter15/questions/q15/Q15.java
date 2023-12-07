package chapter15.questions.q15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q15 {

    private static void optionC() throws SQLException {
        Connection conn = DriverManager.getConnection("");
        conn.setAutoCommit(false);

        var larry = conn.setSavepoint();
        var curly = conn.setSavepoint();
        var moe = conn.setSavepoint();
        var shemp = conn.setSavepoint();

        conn.rollback(moe);

        conn.rollback(curly);
    }

    private static void optionD() throws SQLException {
        Connection conn = DriverManager.getConnection("");
        conn.setAutoCommit(false);

        var larry = conn.setSavepoint();
        var curly = conn.setSavepoint();
        var moe = conn.setSavepoint();
        var shemp = conn.setSavepoint();

        conn.rollback(shemp);

        conn.rollback(curly);

    }
}
