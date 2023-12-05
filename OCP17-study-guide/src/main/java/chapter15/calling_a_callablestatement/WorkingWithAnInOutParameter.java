package chapter15.calling_a_callablestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class WorkingWithAnInOutParameter {

    public static void main(String[] args) throws SQLException {
        test();
    }
    static void test() throws SQLException {


        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        var sql = "{call double_number(?)}";
        try (var cs = conn.prepareCall(sql)) {
            cs.setInt(1, 18);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            System.out.println(cs.getInt("num"));
            System.out.println(cs.getInt(1));
        }
    }
}
