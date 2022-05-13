# Understanding the Class Structure

In Java programs, classes are the basic building blocks. When defining a class, you describe all the parts and
characteristics of one of those building blocks.

To use most classes, you have to create objects. An object is a runtime instance of a class in memory.
A reference is a variable that points to an object.

## Fields and Methods

Java classes have two primary elements: methods , often called functions or procedures in other languages and fields,
more generally known as variables.
Together these are called the members of the class.

Variable hold the state of the program, and methods operate on that state.

## Comments

Another common part of the code is called a comment. Because comments aren’t executable code, you can place them in many
places. There are three types of comments in Java.

Single-Line Comment:

```
// comment until end of line.
```

Multi-Line Comment:

A multi-line comment includes anything starting from the symbol /* until the symbol */

```
/* Multiple
* line comment */
```

Javadoc Comment:

This comment is similar to a multiline comment, except it starts with /**. This special syntax tells the Javadoc tool to
pay attention to the comment.

```
/**
* Javadoc multiple-line comment 
*  @author Jeanne and Scott
*/
```

## Classes and Source Files

Most of the time, each Java class is defined in its own .java file.
If you do have a public type, it needs to match the filename.