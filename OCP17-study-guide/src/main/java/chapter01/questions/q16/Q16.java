package chapter01.questions.q16;

public class Q16 {

    public static void main(String[] args) {

        var blocky = """ 
          squirrel \s
          pigeon \
          termite""";

        // a backslash means to skip the line break.
        // \s means to keep whitespace.
        System.out.print(blocky);
    }
}
