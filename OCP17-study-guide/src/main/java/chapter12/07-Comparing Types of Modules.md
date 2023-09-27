# Comparing Types of Modules

All the modules we’ve used so far in this chapter are called named modules. There are two other types of modules:
automatic modules and unnamed modules. In this section, we describe these three types of modules. On the exam, you
will need to be able to compare them.

## Named Modules

A named module is one containing a module-info.java file. To review, this file appears in the root of the JAR alongside
one or more packages. Unless otherwise specified, a module is a named module. Named modules appear on the module path
rather than the classpath. Later, you learn what happens if a JAR containing a module-info.java file is on the
classpath. For now, just know it is not considered a named module because it is not on the module path.

As a way of remembering this, a named module has the name inside the module-info.java file and is on the module path.

## Automatic Modules

An automatic module appears on the module path but does not contain a module-info.java file. It is simply a regular JAR
file that is placed on the module path and gets treated as a module.

As a way of remembering this, Java automatically determines the module name. The code referencing an automatic module
treats it as if there is a module-info.java file present. It automatically exports all packages. It also determines the
module name. How does it determine the module name, you ask? Excellent question.

Every JAR file contains a special folder called META-INF and, within it, a text file called MANIFEST.MF. It can be
created automatically when the JAR is created or by hand by the JAR’s author.

The authors were encouraged to declare the name they intended to use for the module by adding a property named
Automatic-Module-Name into their MANIFEST.MF file.

**About the MANIFEST.MF File**

A JAR file contains a special text file called META-INF/MANIFEST.MF that contains information about the JAR. It’s been
around significantly longer than modules—since the early days of Java and JARs, to be exact.The figure shows how the
manifest fits into the directory structure of a JAR file.

The manifest contains extra information about the JAR file. For example, it often contains the version of Java used to
build the JAR file. For command-line programs, the class with the main() method is commonly specified.

Each line in the manifest is a key/value pair separated by a colon.You can think of the manifest as a map of property
names and values.The default manifest in Java 17 looks like this:

    Manifest-Version: 1.0
    Created-By: 17 (Oracle Corporation)

Specifying a single property in the manifest allowed library providers to make things easier for applications that
wanted to use their library in a modular application. You can think of it as a promise that when the library becomes a
named module, it will use the specified module name.

If the JAR file does not specify an automatic module name, Java will still allow you to use it in the module path. In
this case, Java will determine the module name for you.

Java determines the automatic module name by basing it on the filename of the JAR file. Let’s go over the rules by
starting with an example. Suppose we have a JAR file named holiday-calendar-1.0.0.jar.

First Java will remove the extension .jar from the name. Then Java will remove the version from the end of the JAR
filename. This is important because we want module names to be consistent. Having a different automatic module name
every time you upgraded to a new version would not be good! After all, this would force you to change the module
declaration of your nice, clean, modularized application every time you pulled in a later version of the holiday
calendar JAR.

Removing the version and extension gives us holiday-calendar. This leaves us with a problem. Dashes (-) are not allowed
in module names. Java solves this problem by converting any special characters in the name to dots (.). As a result, the
module name is holiday.calendar. Any characters other than letters and numbers are considered special characters in this
replacement. Finally, any adjacent dots or leading/trailing dots are removed.

Since that’s a number of rules, let’s review the algorithm in a list for determining the name of an automatic module:

- If the MANIFEST.MF specifies an Automatic-Module-Name, use that. Otherwise, proceed with the remaining rules.
- Remove the file extension from the JAR name.
- Remove any version information from the end of the name. A version is digits and dots with possible extra information
  at the end: for example, -1.0.0 or -1.0-RC.
- Replace any remaining characters other than letters and numbers with dots.
- Replace any sequences of dots with a single dot.
- Remove the dot if it is the first or last character of the result.

![](comparing_types_of_modules/Practicing-with-automatic-module-names.png)

## Unnamed Modules

An unnamed module appears on the classpath. Like an automatic module, it is a regular JAR. Unlike an automatic module,
it is on the classpath rather than the module path. This means an unnamed module is treated like old code and a
second-class citizen to modules.

An unnamed module does not usually contain a module-info.java file. If it happens to contain one, that file will be
ignored since it is on the classpath.

Unnamed modules do not export any packages to named or automatic modules. The unnamed module can read from any JARs on
the classpath or module path. You can think of an unnamed module as code that works the way Java worked before modules.
Yes, we know it is confusing for something that isn’t really a module to have the word module in its name.

You can expect to get questions on the exam comparing the three types of modules. Please study Table 12.17 thoroughly
and be prepared to answer questions about these items in any combination. A key point to remember is that code on the
classpath can access the module path. By contrast, code on the module path is unable to read from the classpath.

## Reviewing Module Types

You can expect to get questions on the exam comparing the three types of modules. Please study Table 12.17 thoroughly
and be prepared to answer questions about these items in any combination. A key point to remember is that code on the
classpath can access the module path. By contrast, code on the module path is unable to read from the classpath.

![](comparing_types_of_modules/Properties-of-module-types.png)

