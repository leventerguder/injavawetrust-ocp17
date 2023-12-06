package chapter15.controlling_data_with_transactions.bookmarking_with_savepoints;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;

public class BookmarkingWithSavePointsExample1 {

    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");

        // You can only use savepoints when you are controlling the transaction.
        //conn.setAutoCommit(false); // required!
        Savepoint sp1 = conn.setSavepoint();
    }
}
