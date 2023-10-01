package chapter12.questions.q17;

public class Q17 {

    // Suppose we have a JAR file named cat-1.2.3-RC1.jar, and Automatic-Module-Name in the MANIFEST.MF is set to dog.
    // What should an unnamed module referencing this automatic module include in module-info.java?

//    An unnamed module doesn’t use a module-info.java file. Therefore,
//    option E is correct. An unnamed module can access an automatic module. The unnamed
//    module would simply treat the automatic module as a regular JAR without involving the
//    module.info file.
}
