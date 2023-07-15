package chapter04.creating_and_manipulating_strings;

public class FindingAnIndex {

    public static void main(String[] args) {

        var name = "animals";
        System.out.println(name.indexOf('a')); // 0
        System.out.println(name.indexOf("al")); // 4
        System.out.println(name.indexOf('a', 4)); // 4
        System.out.println(name.indexOf('a', 5)); // -1
        System.out.println(name.indexOf("al", 5)); // -1


        String content = "abc dda fag";

        System.out.println(content.lastIndexOf("a")); //9
        System.out.println(content.lastIndexOf("a", 6)); //6
        System.out.println(content.lastIndexOf("a", 3));//3
    }
}
