package chapter15.working_with_a_preparedstatement.updating_multiple_records;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatingMultipleRecordsExample {

    public static void main(String[] args) throws SQLException {

        test();
    }

    public static void test() throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        var sql = "INSERT INTO names VALUES(?, ?, ?)";

        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, 20);
            ps.setInt(2, 1);
            ps.setString(3, "Ester");
            ps.executeUpdate();
            ps.setInt(1, 21);
            ps.setString(3, "Elias");
            ps.executeUpdate();
        }


        try (var psFetch = conn.prepareStatement("Select * from names")) {
            ResultSet resultSet = psFetch.executeQuery();
            while ((resultSet.next())) {
                int id = resultSet.getInt(1);
                int type = resultSet.getInt(2);
                String name = resultSet.getString(3);

                System.out.println(id + "," + type + "," + name);
            }
        }
    }
}
