package chapter01;

// Case 1

//import java.util.*;
//import java.sql.*; // causes Date declaration to not compile

// Case 2

// If you explicitly import a class name, it takes precedence over any wildcards present. Java thinks, “The programmer
// really wants me to assume use of the java.util.Date class.”

//import java.util.Date;

import java.sql.*;

// Case 3

// Java is smart enough to detect that this code is no good.
//import java.util.Date;
//import java.sql.Date;

public class Conflicts {
    Date date;
}
