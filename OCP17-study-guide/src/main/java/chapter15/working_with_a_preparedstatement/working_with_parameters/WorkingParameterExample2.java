package chapter15.working_with_a_preparedstatement.working_with_parameters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WorkingParameterExample2 {


    public static void main(String[] args) throws SQLException {

        register(100, 1);
    }

   static  void register(int key, int type) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setInt(2, type);
            // missing the set for parameter number 3
            ps.executeUpdate();
            // java.sql.SQLException: Parameter not set
        }
    }


}
