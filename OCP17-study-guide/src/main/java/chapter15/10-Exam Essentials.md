# Exam Essentials

**Name the core five JDBC interfaces that you need to know for the exam and where they are defined.**

The five key interfaces are Driver, Connection, PreparedStatement, CallableStatement, and ResultSet. The interfaces are
part of the core Java APIs. The implementations are part of a database driver JAR file.

**Identify correct and incorrect JDBC URLs.**

A JDBC URL starts with jdbc:, followed by the vendor/product name. Next comes another colon and then a database-specific
connection string. This database-specific string includes the location, such as localhost or an IP address with an
optional port. It may also contain the name of the database.

**Describe how to get a Connection using DriverManager.**

After including the driver JAR in the classpath, call DriverManager.getConnection(url) or DriverManager.getConnection(
url, username, password) to get a driver-specific Connection implementation class.

**Run queries using a PreparedStatement.**

When using a PreparedStatement, the SQL contains question marks (?) for the parameters or bind variables. This SQL is
passed at the time the PreparedStatement is created, not when it is run. You must call a setter for each of these with
the proper value before executing the query.

**Run queries using a CallableStatement.**

When using a CallableStatement, the SQL looks like { call my_proc(?)}. If you are returning a value, {?= call my_proc(?)
} is also permitted. You must set any parameter values before executing the query. Additionally, you must call
registerOutParameter() for any OUT or INOUT parameters.

**Loop through a ResultSet.**

Before trying to get data from a ResultSet, you call rs.next() inside an if statement or while loop. This ensures that
the cursor is in a valid position. To get data from a column, call a method like getString(1) or getString("a").
Remember that column indexes begin with 1.

**Work with transactions.**

When autocommit is false, the commit() and rollback() methods control the transaction. There is an overloaded rollback
method taking a Savepoint to roll back to a specific point.

**Identify when a resource should be closed.**

If you’re closing all three resources, the ResultSet must be closed first, followed by the PreparedStatement/
CallableStatement, and the Connection.