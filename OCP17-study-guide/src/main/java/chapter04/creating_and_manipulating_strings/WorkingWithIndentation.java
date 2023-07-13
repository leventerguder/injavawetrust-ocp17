package chapter04.creating_and_manipulating_strings;

public class WorkingWithIndentation {

    public static void main(String[] args) {

        indentTextBlock();

        indentTextBlock2();

        indentTextBlock3();

        indentConcat();

        indentConcat2();

        stripIndent();

        stripIndent2();

    }

    private static void indentTextBlock() {

        System.out.println("##### indentTextBlock #####");

        var block = """ 
                a
                 b
                c""";

        for (char c : block.toCharArray()) {
            System.out.print(String.format("\\u%04x", (int) c) + " | ");
        }
        System.out.println();

        System.out.println(block);
        System.out.println(block.length()); // 6

        System.out.println(block.indent(1));
        System.out.println(block.indent(1).length()); // 10

        // We ask Java to add a single blank space to each of the three lines in block.
        // However, the output says we added 4 characters rather than 3 since the length went from 6 to 10.
        // This mysterious additional character is thanks to the line termination normalization.
        // Since the text block doesn’t have a line break at the end, indent() adds one!
    }

    private static void indentTextBlock2() {

        System.out.println("##### indentTextBlock2 #####");

        var block = """ 
                a
                 b
                c
                """;

        for (char c : block.toCharArray()) {
            System.out.print(String.format("\\u%04x", (int) c) + " | ");
        }
        System.out.println();

        System.out.println(block);
        System.out.println(block.length()); // 7

        System.out.println(block.indent(1));
        System.out.println(block.indent(1).length()); // 10

        // We have line break! The indent does not add it at the end.
    }

    private static void indentTextBlock3() {

        System.out.println("##### indentTextBlock3 #####");

        var block = """ 
                a\n
                 b\n
                c\n
                """;

        for (char c : block.toCharArray()) {
            System.out.print(String.format("\\u%04x", (int) c) + " | ");
        }
        System.out.println();

        System.out.println(block);
        System.out.println(block.length()); // 10

        System.out.println(block.indent(1));
        System.out.println(block.indent(1).length()); // 16

        // We have line break! The indent does not add it at the end.
    }


    private static void indentConcat() {

        System.out.println("##### indentConcat #####");

        var concat = " a\n"
                + "  b\n"
                + " c";

        System.out.println(concat.length());    //9
        System.out.println(concat.indent(-1).length()); // 7

        // We remove one whitespace character from each of the three lines of concat.
        // This gives a length of seven. We started with nine, got rid of three characters,
        // and added a trailing normalized new line.


        System.out.println(concat.indent(-4).length()); // 6

        // we ask Java to remove four whitespace characters from the same three lines.
        // Since there are not four whitespace characters, Java does its best.
        // The single space is removed before a and c.
        // Both spaces are removed before b. The length of six should make sense here; we removed one more character here
    }

    private static void indentConcat2() {

        System.out.println("##### indentConcat2 #####");

        var concat = " a\n"
                + "  b\n"
                + " c\n";

        System.out.println(concat.length());    //10
        System.out.println(concat.indent(-1).length()); // 7

        // We remove one whitespace character from each of the three lines of concat.
        // This gives a length of seven. We started with nine, got rid of three characters,
        // and NOT added a trailing normalized new line.


        System.out.println(concat.indent(-4).length()); // 6

        // we ask Java to remove four whitespace characters from the same three lines.
        // Since there are not four whitespace characters, Java does its best.
        // The concat ends with \n !
    }


    private static void stripIndent() {

        System.out.println("##### stripIndent #####");

        var concat = " a\n"
                + "  b\n"
                + " c";

        System.out.println(concat.length());

        System.out.println(concat.stripIndent());
        System.out.println(concat.stripIndent().length()); // 6


        // All of the lines have at least one whitespace character.
        // Since they do not all have two whitespace characters,
        // the method only gets rid of one character per line.
        // Since no new line is added by stripIndent(), the length is six, which is three less than the original nine.
    }

    private static void stripIndent2() {

        System.out.println("##### stripIndent2 #####");

        var concat = "a\n"
                + "  b\n"
                + " c";

        System.out.println(concat.length()); //8

        System.out.println(concat.stripIndent());
        System.out.println(concat.stripIndent().length()); // 8

    }
}
