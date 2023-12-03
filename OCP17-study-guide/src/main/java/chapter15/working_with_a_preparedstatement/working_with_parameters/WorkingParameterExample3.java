package chapter15.working_with_a_preparedstatement.working_with_parameters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WorkingParameterExample3 {


    public static void main(String[] args) throws SQLException {

        register(100, 1, "admin");
    }

    static void register(int key, int type, String name) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        var sql = "INSERT INTO names VALUES(?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setInt(2, type);
            ps.setString(3, name);
            ps.executeUpdate();

            // java.sql.SQLSyntaxErrorException: row column count mismatch in statement [INSERT INTO names VALUES(?, ?)]
        }

    }

}
