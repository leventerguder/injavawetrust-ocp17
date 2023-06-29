package chapter01.questions.q01;

public class Q01 {

    // Which of the following are legal entry point methods that can be run from the command line?
    // (Choose all that apply.)

    // A - private static void main(String[] args)
    // B - public static final main(String[] args)
    // C - public void main(String[] args)
    // ++D - public static final void main(String[] args)
    // ++E - public static void main(String[] args)
    // F - public static main(String[] args)

}

class Option1 {
    private static void main(String[] args) {
    }
    // The main() method must be public !
}

class Option2 {
    //public static final main(String[] args) {} // DOES NOT COMPILE
    // The main() method must have void return type.
}

class Option3 {
    public void main(String[] args) {
    }
    // The main() method must be static.
}

class Option4 {
    public static final void main(String[] args) {
        System.out.println("This is a valid legal entry point main() method!");
    }
}

class Option5 {
    public static void main(String[] args) {
        System.out.println("This is a valid legal entry point main() method!");
    }
}

class Option6{
    //public static main(String[] args) {} // DOES NOT COMPILE
    // The main() method must have void return type.
}