package chapter04.using_the_stringbuilder_class;

public class StringBuilderAppendingValues {

    public static void main(String[] args) {

        var sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true

        //sb.append(null);
        sb.append("null");

        System.out.println(sb); // 1c-truenull

    }
}
