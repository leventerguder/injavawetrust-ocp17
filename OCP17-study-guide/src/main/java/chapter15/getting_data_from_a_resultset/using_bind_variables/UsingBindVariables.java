package chapter15.getting_data_from_a_resultset.using_bind_variables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UsingBindVariables {

    public static void main(String[] args) throws SQLException {
        test();
    }

    static void test() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        var sql = "SELECT id FROM exhibits WHERE name = ?";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setString(1, "Zebra");
            try (var rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    System.out.println(id);
                }
            }
        }
    }
}
