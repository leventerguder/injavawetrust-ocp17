package chapter15.controlling_data_with_transactions.bookmarking_with_savepoints;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class BookmarkingWithSavePointsExample3 {

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

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5431/ocp-book", "postgres", "password");

        try (Statement statement = conn.createStatement();
             PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT)) {

            statement.execute(SQL_TABLE_DROP);
            statement.execute(SQL_TABLE_CREATE);

            conn.setAutoCommit(false); // default true

            // Run list of insert commands
            psInsert.setString(1, "Employee-1");
            psInsert.setInt(2, 100);
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();

            Savepoint sp1 = conn.setSavepoint();

            psInsert.setString(1, "Employee-2");
            psInsert.setInt(2, 200);
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();

            Savepoint sp2 = conn.setSavepoint("second savepoint");

            psInsert.setString(1, "Employee-3");
            psInsert.setInt(2, 300);
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();

            conn.rollback(sp1);
            conn.rollback(sp2);
            // ERROR: savepoint "second savepoint" does not exist

            conn.commit();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
