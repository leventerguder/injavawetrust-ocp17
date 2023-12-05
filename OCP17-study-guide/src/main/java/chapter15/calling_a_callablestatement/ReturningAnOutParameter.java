package chapter15.calling_a_callablestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ReturningAnOutParameter {

    public static void main(String[] args) throws SQLException {

        test();
    }

    static void test() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        var sql = "{?= call magic_number(?) }";

        try (var cs = conn.prepareCall(sql)) {
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            //cs.executeQuery();  // java.sql.SQLException: statement does not generate a result set
            System.out.println(cs.getInt("num"));
            System.out.println(cs.getInt(1));
        }
    }
}
