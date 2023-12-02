package chapter15.working_with_a_preparedstatement;

import java.sql.*;
import java.util.Arrays;

public class PreparedStatementExample1 {

    void test() throws SQLException {
        Connection conn = DriverManager.getConnection("");

        try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM exhibits")) {
// work with ps
        }

    }

    void test2() throws SQLException {

        Connection conn = DriverManager.getConnection("");
        // try (var ps = conn.prepareStatement()) { // DOES NOT COMPILE }

        // Passing a SQL statement when creating the object is mandatory
    }

    void test3() throws SQLException {

        var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
        var updateSql = "UPDATE exhibits SET name = '' " + "WHERE name = 'None'";
        var deleteSql = "DELETE FROM exhibits WHERE id = 10";

        Connection conn = DriverManager.getConnection("");

        try (var ps = conn.prepareStatement(insertSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 1
        }

        try (var ps = conn.prepareStatement(updateSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 0
        }

        try (var ps = conn.prepareStatement(deleteSql)) {
            int result = ps.executeUpdate();
            System.out.println(result); // 1
        }
    }

    void test4() throws SQLException {

        Connection conn = DriverManager.getConnection("");

        var sql = "SELECT * FROM exhibits";
        try (var ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) { // work with rs
        }

    }

    void test5() throws SQLException {

        var sql = "SELECT * FROM exhibits";
        Connection conn = DriverManager.getConnection("");

        try (var ps = conn.prepareStatement(sql)) { // work with rs

            boolean isResultSet = ps.execute();
            if (isResultSet) {
                try (ResultSet rs = ps.getResultSet()) {
                    System.out.println("ran a query");
                }
            } else {
                int result = ps.getUpdateCount();
                System.out.println("ran an update");
            }
        }

    }

    void test6() throws SQLException {
        var sql = "SELECT * FROM names";
        Connection conn = DriverManager.getConnection("");
        try (var ps = conn.prepareStatement(sql)) {
            var result = ps.executeUpdate();
        }

    }

    public static void register(Connection conn) throws SQLException {
        var sql = "INSERT INTO names VALUES(6, 1, 'Edith')";
        try (var ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }

    public static void register(Connection conn, int key, int type, String name) throws SQLException {

        String sql = "INSERT INTO names VALUES(?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setString(3, name);
            ps.setInt(2, type);
            ps.executeUpdate();
        }
    }


    void test7(int key, int type) throws SQLException {
        var sql = "INSERT INTO names VALUES(?, ?, ?)";
        Connection conn = DriverManager.getConnection("");
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setInt(2, type);
            // missing the set for parameter number 3
            ps.executeUpdate();
        }
    }

    void test8(int key, int type, String name) throws SQLException {

        Connection conn = DriverManager.getConnection("");
        var sql = "INSERT INTO names VALUES(?, ?)";
        try (var ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setInt(2, type);
            ps.setString(3, name);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    void test9(int key, int type, String name) throws SQLException {

        Connection conn = DriverManager.getConnection("");
        String sql = "INSERT INTO names VALUES(?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setObject(1, key);
            ps.setObject(2, type);
            ps.setObject(3, name);
            ps.executeUpdate();
        }

    }

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
