package chapter15.calling_a_callablestatement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class WorkingWithAnInOutParameter {

    Connection conn = null;

    void test() throws SQLException {

        var sql = "{call double_number(?)}";
        try (var cs = conn.prepareCall(sql)) {
            cs.setInt(1, 8);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.execute();
            System.out.println(cs.getInt("num"));
        }
    }
}
