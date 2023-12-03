package chapter15.working_with_a_preparedstatement;

import java.sql.*;
import java.util.Arrays;

public class PreparedStatementExample1 {


    public static void register(Connection conn, int firstKey, int type, String... names) throws SQLException {

        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        var nextIndex = firstKey;

        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(2, type);
            for (var name : names) {
                ps.setInt(1, nextIndex);
                ps.setString(3, name);
                ps.addBatch();
                nextIndex++;
            }
            int[] result = ps.executeBatch();
            System.out.println(Arrays.toString(result));
        }
    }
}
