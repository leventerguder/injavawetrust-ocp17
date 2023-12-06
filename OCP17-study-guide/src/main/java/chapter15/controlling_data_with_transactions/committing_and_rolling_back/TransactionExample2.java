package chapter15.controlling_data_with_transactions.committing_and_rolling_back;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TransactionExample2 {

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5431/ocp-book", "postgres", "password");

        try (Statement statement = conn.createStatement();
             PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT)) {

            statement.execute(SQL_TABLE_DROP);
            statement.execute(SQL_TABLE_CREATE);

            conn.setAutoCommit(false); // default true

            // Run list of insert commands
            psInsert.setString(1, "Employee-1-v2");
            psInsert.setInt(2, 100);
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();

            psInsert.setString(1, "Employee-2-v2");
            psInsert.setInt(2, 200);
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();

            psInsert.setString(2, "Employee-3-exception-v2");
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));

            psInsert.execute();

            conn.commit();

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("Rollback...");
            conn.rollback();
        }

    }

    private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";

    private static final String SQL_TABLE_CREATE = "CREATE TABLE EMPLOYEE"
            + "("
            + " ID Serial,"
            + " NAME varchar(100) NOT NULL,"
            + " SALARY numeric(15, 2) NOT NULL,"
            + " CREATED_DATE timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,"
            + " PRIMARY KEY (ID)"
            + ")";

    private static final String SQL_TABLE_DROP = "DROP TABLE IF EXISTS EMPLOYEE";

}