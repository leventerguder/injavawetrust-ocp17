package chapter15.working_with_a_preparedstatement.working_with_parameters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WorkingParameterExample4 {


    public static void main(String[] args) throws SQLException {

        register(100, 1, "admin");
    }

    static void register(int key, int type, String name) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
        String sql = "INSERT INTO names VALUES(?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, key);
            ps.setObject(2, type);
            ps.setObject(3, name);
            ps.executeUpdate();
        }

    }


}
