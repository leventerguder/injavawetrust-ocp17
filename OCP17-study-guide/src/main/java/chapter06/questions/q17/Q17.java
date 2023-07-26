package chapter06.questions.q17;

public class Q17 {

//    Which of the following are true? (Choose all that apply.)
//    A. this() can be called from anywhere in a constructor.
//    B. this() can be called from anywhere in an instance method.
//++    C. this.variableName can be called from any instance method in the class.
//    D. this.variableName can be called from any static method in the class.
//    E. You can call the default constructor written by the compiler using this().
//++    F. You can access a private constructor with the main() method in the same class.
}


class Sample {

    int number;

    private Sample() {
        // System.out.println("DOES NOT COMPILE");
        this(100);
    }

    void method() {
        // this(100); // DOES NOT COMPILE

        System.out.println("method....");
        System.out.println(this.number);
    }

    static void staticMethod() {
        // System.out.println(this.number); // DOES NOT COMPILE
    }

    public Sample(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
    }
}


