# Learning about the Environment

## Major Components of Java

The Java Development Kit (JDK) contains the minimum software you need to do Java development.
Key commands include;

- javac : Converts .java source files into .class bytecode
- java : Executes the program
- jar : Package files together
- javadoc : Generates documentation

The javac program generates instructions in a special format called bytecode that the java command can run.
Then java launches the Java Virtual Machine (JVM) before running the code. The JVM knows how to run bytecode on the
actual machine it is on. You can think of the JVM as a special magic box on your machine that knows how to run your
.class file within your particular operating system and hardware.

Before we go any further, ensure that you have the right version of Java on your path.

- javac -version
- java -version