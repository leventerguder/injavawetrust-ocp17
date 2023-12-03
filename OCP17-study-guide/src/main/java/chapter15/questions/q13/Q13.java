package chapter15.questions.q13;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q13 {

    void method1() throws SQLException {

        PreparedStatement ps = null;

        var rs = ps.executeQuery();
        if (rs.next()) {
            String s = rs.getString(1);
        }
    }

    void method2() throws SQLException {

        PreparedStatement ps = null;

        var rs = ps.executeQuery();
        if (rs.next()) {
            Object s = rs.getObject(1);
        }
    }
}
