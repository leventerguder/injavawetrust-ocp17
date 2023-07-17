package chapter04.questions.q16;

public class Q16 {

    public static void main(String[] args) {

        var base = "ewe\nsheep\\t";

        int length = base.length(); //11
        int indent = base.indent(2).length(); //16
        int translate = base.translateEscapes().length(); //10

        var formatted = "%s %s %s".formatted(length, indent, translate);
        System.out.println(formatted);
    }
}
