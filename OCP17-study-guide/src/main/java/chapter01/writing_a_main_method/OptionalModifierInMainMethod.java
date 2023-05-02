package chapter01.writing_a_main_method;

public class OptionalModifierInMainMethod {

    /*
    While most modifiers, such as public and static, are required for main() methods,
    there are some optional modifiers allowed.

    In this example, both final modifiers are optional,
    and the main() method is a valid entry point with or without them
     */
    public final static void main(final String[] args) {
        System.out.println("final main method!");
    }
}
