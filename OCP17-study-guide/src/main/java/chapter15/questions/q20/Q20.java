package chapter15.questions.q20;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Q20 {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:hsqldb:file:zoo";
//        try (var conn = DriverManager.getConnection(url);
////             var ps = conn.prepareStatement(); // COMPILE ERROR
////             var rs = ps.executeQuery("SELECT * FROM swings")) {
////             while (rs.next()) {
////                System.out.println(rs.getInteger(1));
////             }
//        }
    }
}

