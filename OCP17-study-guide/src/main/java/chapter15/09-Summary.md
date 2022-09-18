# Summary

There are four key SQL statements you should know for the exam, one for each of the CRUD operations: create (INSERT) a
new row, read (SELECT) data, update (UPDATE) one or more rows, and delete (DELETE) one or more rows.

For the exam, you should be familiar with five JDBC interfaces: Driver, Connection, PreparedStatement,
CallableStatement, and ResultSet. The interfaces are part of the Java API. A database-specific JAR file provides the
implementations.

To connect to a database, you need the JDBC URL. A JDBC URL has three parts separated by colons. The first part is
jdbc. The second part is the name of the vendor/product. The third part varies by database, but it includes the location
and/or name of the database. The location is either localhost or an IP address followed by an optional port.

The DriverManager class provides a factory method called getConnection() to get a Connection implementation. You create
a PreparedStatement or CallableStatement using prepareStatement() and prepareCall(), respectively.

A PreparedStatement is used when the SQL is specified in your application, and a CallableStatement is used when the SQL
is in the database. A PreparedStatement allows you to set the values of bind variables. A CallableStatement also allows
you to set IN, OUT, and INOUT parameters.

When running a SELECT SQL statement, the executeQuery() method returns a ResultSet. When running a DELETE, INSERT, or
UPDATE SQL statement, the executeUpdate() method returns the number of rows that were affected. There is also an
execute() method that returns a boolean to indicate whether the statement was a query.

You call rs.next() from an if statement or while loop to advance the cursor position. To get data from a column, call
a method like getString(1) or getString("a"). Column indexes begin with 1, not 0. In addition to getting a String or
primitive, you can call getObject() to get any type.

JDBC lets you choose whether to automatically commit your statements or manage transactions yourself. If you choose
the latter, you can control when data is committed or rolled back. Additionally, you can set savepoints to roll back to
specific points.

It is important to close JDBC resources when finished with them to avoid leaking resources. Closing a Connection
automatically closes the Statement and ResultSet objects. Closing a Statement automatically closes the ResultSet object.
Also, running another SQL statement closes the previous ResultSet object from that Statement.


