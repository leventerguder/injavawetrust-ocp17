package chapter04.creating_and_manipulating_strings;

public class GettingASubstring {

    public static void main(String[] args) {

        var name = "animals";
        System.out.println(name.substring(3));      //mals
        System.out.println(name.substring(name.indexOf('m'))); //mals
        System.out.println(name.substring(3, 4)); // m
        System.out.println(name.substring(3, 7)); // mals
        System.out.println(name.substring(2, 5)); //ima


        System.out.println(name.substring(3, 3)); // empty string
        // System.out.println(name.substring(3, 2)); // exception
        // System.out.println(name.substring(3, 8)); // exception

    }
}
