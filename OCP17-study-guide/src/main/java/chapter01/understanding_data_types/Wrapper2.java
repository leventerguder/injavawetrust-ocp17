package chapter01.understanding_data_types;

public class Wrapper2 {

    public static void main(String[] args) {
        System.out.println(Boolean.valueOf("true")); // true
        System.out.println(Boolean.valueOf("TrUe")); // true
        System.out.println(Boolean.valueOf("false")); // false
        System.out.println(Boolean.valueOf("FALSE")); // false
        System.out.println(Boolean.valueOf("kangaroo")); // false
        System.out.println(Boolean.valueOf(null)); // false
    }
}
