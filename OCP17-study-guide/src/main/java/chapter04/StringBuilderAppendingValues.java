package chapter04;

public class StringBuilderAppendingValues {

    public static void main(String[] args) {

        var sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true

    }
}
