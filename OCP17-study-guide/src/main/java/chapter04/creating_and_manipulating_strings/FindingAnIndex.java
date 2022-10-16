package chapter04.creating_and_manipulating_strings;

public class FindingAnIndex {

    public static void main(String[] args) {

        var name = "animals";
        System.out.println(name.indexOf('a')); // 0
        System.out.println(name.indexOf("al")); // 4
        System.out.println(name.indexOf('a', 4)); // 4
        System.out.println(name.indexOf("al", 5)); // -1
    }
}
