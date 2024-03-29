# Closing Database Resources

As you saw in Chapter 14, “I/O,” it is important to close resources when you are fin- ished with them. This is true for
JDBC as well. JDBC resources, such as a Connection, are expensive to create. Not closing them creates a resource leak
that will eventually slow your program.

The ResultSet is closed first, followed by the PreparedStatement (or CallableStatement) and then the Connection.

While it is a good habit to close all three resources, it isn’t strictly necessary. Closing a JDBC resource should close
any resources that it created. In particular, the following are true:

- Closing a Connection also closes PreparedStatement (or CallableStatement) and ResultSet.
- Closing a PreparedStatement (or CallableStatement) also closes the ResultSet.

It is important to close resources in the right order. This avoids both resource leaks and exceptions.

**Writing a Resource Leak**

In Chapter 11, you learned that it is possible to declare a type before a try-with-resources statement. Do you see why
this method is bad?

     public void bad() throws SQLException {
         var url = "jdbc:hsqldb:zoo";
         var sql = "SELECT not_a_column FROM names";
         var conn = DriverManager.getConnection(url);
         var ps = conn.prepareStatement(sql);
         var rs = ps.executeQuery();
        
         try (conn; ps; rs) {
             while (rs.next())
                 System.out.println(rs.getString(1));
             }
     }

Suppose an exception is thrown on line (ps.executeQuery();) The try-with-resources block is never entered, so we don’t
benefit from automatic resource closing.That means this code has a resource leak if it fails. Do not write code like
this.

There’s another way to close a ResultSet. JDBC automatically closes a ResultSet when you run another SQL statement from
the same Statement. This could be a PreparedStatement or a CallableStatement.

**Dealing with Exceptions**

In most of this chapter, we’ve lived in a perfect world. Sure, we mentioned that a checked SQLException might be thrown
by any JDBC method—but we never caught it. We just declared it and let the caller deal with it. Now let’s catch the
exception.

    var sql = "SELECT not_a_column FROM names";
    var url = "jdbc:hsqldb:zoo";
    try (var conn = DriverManager.getConnection(url);
        var ps = conn.prepareStatement(sql); var rs = ps.executeQuery()) {

        while (rs.next()) 
            System.out.println(rs.getString(1));
        } catch (SQLException e) { 
            System.out.println(e.getMessage()); 
            System.out.println(e.getSQLState()); 
            System.out.println(e.getErrorCode());
    }

The output looks like this:

    Column 'NOT_A_COLUMN' is either not in any table... 
    42X04
    30000

ach of these methods gives you a different piece of information.The getMessage() method returns a human-readable message
about what went wrong. We’ve only included the beginning of it here.The getSQLState() method returns a code as to what
went wrong.You can Google the name of your database and the SQL state to get more information about the error. In
comparison, getErrorCode() is a database-specific code. On this database, it doesn’t do anything.