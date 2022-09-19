package chapter01.writing_a_main_method;

// javac ZooV2.java
// java Zoo2 value1 value2
// java Zoo2 "value1 value2" value3

public class ZooV2 {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
