package chapter15.questions.q09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q09 {

    public static void main(String[] args) throws SQLException {


        Connection conn = DriverManager.getConnection("");

        var sql = "SELECT toy FROM enrichment WHERE animal = ?";
        try (var ps = conn.prepareStatement(sql)) {
            try (var rs = ps.executeQuery()) {
                while (rs.next())
                    System.out.println(rs.getString(1));
            }
        }
    }
}
