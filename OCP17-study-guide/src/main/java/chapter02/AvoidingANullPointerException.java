package chapter02;

public class AvoidingANullPointerException {

    public static void main(String[] args) {

        Duck duck = null;

        methodNoException(duck);
        methodNullPointerException(duck);
    }

    static void methodNoException(Duck duck) {

        if (duck != null && duck.getAge() < 5) {

        }
    }

    static void methodNullPointerException(Duck duck) {

        if (duck != null & duck.getAge() < 5) { // Could throw a NullPointerException // Do something

        }
    }
}


class Duck {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}