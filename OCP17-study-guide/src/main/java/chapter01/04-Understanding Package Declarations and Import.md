# Understanding Package Declarations and Imports

## Packages

Java classes are grouped into packages. The import statement tells the compiler which package to look in to find a
class.

Package names are hierarchical like the mail as well. The postal service starts with the top level, looking at your
country first. You start reading a package name at the beginning too.

## Wildcards

Classes in the same package are often imported together. You can use a shortcut to import all the classes in a package.
The import statement doesn’t bring in child packages, fields, or methods; it imports only classes directly under the
package.

You might think that including so many classes slows down your program execution, but it doesn’t. The compiler figures
out what’s actually needed.

## Redundant Imports

We’ve been referring to System without an import every time we printed text, and Java found it just fine. There’s one
special package in the Java world called java.lang. This package is special in that it is automatically imported.

## Naming Conflicts

One of the reasons for using packages is so that class names don’t have to be unique across all of Java. This means
you’ll sometimes want to import a class that can be found in multiple places.

You can write either import java.util.*; or import java.util.Date;
When the class name is found in multiple packages, Java gives you a compiler error.

```
public class Conflicts {
    Date date;
}
```

```
import java.util.*;
import java.sql.*; // causes Date declaration to not compile
```

When the class name is found in multiple packages, Java gives you a compiler error.

```
import java.util.Date; 
import java.sql.*;
```

If you explicitly import a class name, it takes precedence over any wildcards present. Java thinks, “The programmer
really wants me to assume use of the java.util.Date class.”

```
import java.util.Date; 
import java.sql.Date;
```

Java is smart enough to detect that this code is no good.

### If You Really Need to UseTwo Classes with the Same Name

Sometimes you really do want to use Date from two different packages. When this happens, you can pick one to use in
the import statement and use the other’s fully qualified class name. Or you can drop both import statements and always
use the fully qualified class name.

```
public class ConflictsBothDate {
    java.util.Date date;
    java.sql.Date sqlDate;
}

```