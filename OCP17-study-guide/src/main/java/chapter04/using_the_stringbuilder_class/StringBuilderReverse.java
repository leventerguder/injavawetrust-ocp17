package chapter04.using_the_stringbuilder_class;

public class StringBuilderReverse {

    public static void main(String[] args) {

        var sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb); //CBA

        var sb2 = new StringBuilder("hello-world");
        System.out.println(sb2.reverse());
    }
}
