package chapter01.understanding_package_declarations_and_imports;

// Case 2

// If you explicitly import a class name, it takes precedence over any wildcards present. Java thinks, “The programmer
// really wants me to assume use of the java.util.Date class.”

import java.util.Date;
import java.sql.*;


public class ConflictsV2 {
    Date date;
}
