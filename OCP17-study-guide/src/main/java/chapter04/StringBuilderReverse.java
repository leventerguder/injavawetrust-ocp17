package chapter04;

public class StringBuilderReverse {

    public static void main(String[] args) {

        var sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb); //CBA
    }
}
