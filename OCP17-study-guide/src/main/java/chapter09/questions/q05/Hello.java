package chapter09.questions.q05;

public record Hello<T>(T t) {
    public Hello(T t) {
        this.t = t;
    }

    private <T> void println(T message) {
        System.out.print(t + "-" + message);
    }


    public static void main(String[] args) {
        new Hello<String>("hi").println(1);
        new Hello("hola").println(true);

        // creates the Hello class with the generic type Object since no type is specified for that instance.
        // It passes a boolean to println(), which gets autoboxed into a Boolean.
    }
}