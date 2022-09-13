package chapter15.connectingtoadatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnect {

    public static void main(String[] args) throws SQLException {

        try (Connection conn = DriverManager.getConnection("")) {
            System.out.println(conn
            );
        }
    }
}
