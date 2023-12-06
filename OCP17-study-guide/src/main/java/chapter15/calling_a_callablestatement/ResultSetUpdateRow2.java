package chapter15.calling_a_callablestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetUpdateRow2 {
    public static void main(String args[]) throws SQLException {

        // https://www.tutorialspoint.com/the-resultset-updaterow-method-with-example

        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5431/ocp-book", "postgres", "postgres");
        dropExisting(conn);
        createTables(conn);

        System.out.println("Connection established......");

        String query = "Select * from Customers";

        PreparedStatement stmt = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        //PreparedStatement stmt = conn.prepareStatement(query, ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            if (rs.getInt("ID") == 5) {

                rs.updateInt("Salary", 11000);
                rs.updateString("ADDRESS", "Narsipatnam");
                rs.updateRow();
            }
        }
        rs.beforeFirst();
        System.out.println("Contents of the Customers table after the update: ");
        //Printing the contents of the table
        while (rs.next()) {
            System.out.print("ID: " + rs.getInt("ID") + ", ");
            System.out.print("Name: " + rs.getString("Name") + ", ");
            System.out.print("Age: " + rs.getInt("Age") + ", ");
            System.out.print("Salary: " + rs.getInt("Salary") + ", ");
            System.out.print("Address: " + rs.getString("Address"));
            System.out.println();
        }
    }

    private static void dropExisting(Connection conn) throws SQLException {
        run(conn, "DROP TABLE IF EXISTS CUSTOMERS");
    }

    private static void createTables(Connection conn) throws SQLException {
        run(conn, """
                CREATE TABLE customers (
                   ID INT,
                   Name VARCHAR(20),
                   AGE INT,
                   SALARY INT,
                   ADDRESS VARCHAR(255),
                   PRIMARY KEY (ID)
                );
                """);

        run(conn, "insert into customers values(1, 'Amit', 25, 3000, 'Hyderabad')");
        run(conn, "insert into customers values(2, 'Kalyan', 27, 4000, 'Vishakhapatnam')");
        run(conn, "insert into customers values(3, 'Renuka', 30, 5000, 'Delhi')");
        run(conn, "insert into customers values(4, 'Archana', 24, 1500, 'Mumbai')");
        run(conn, "insert into customers values(5, 'Kaushik', 30, 9000, 'Kota')");
        run(conn, "insert into customers values(6, 'Hardik', 45, 6400, 'Bhopal')");
        run(conn, "insert into customers values(7, 'Trupthi', 33, 4360, 'Ahmedabad')");
        run(conn, "insert into customers values(8, 'Mithili', 26, 4100, 'Vijayawada')");
        run(conn, "insert into customers values(9, 'Maneesh', 39, 4000, 'Hyderabad')");
        run(conn, "insert into customers values(10, 'Rajaneesh', 30, 6400, 'Delhi')");
        run(conn, "insert into customers values(11, 'Komal', 29, 8000, 'Ahmedabad')");
        run(conn, "insert into customers values(12, 'Manyata', 25, 5000, 'Vijayawada')");
    }

    private static void run(Connection conn, String sql) throws SQLException {
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.executeUpdate();
        }
    }
}