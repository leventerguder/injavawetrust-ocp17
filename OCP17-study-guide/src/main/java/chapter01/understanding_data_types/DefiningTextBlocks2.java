package chapter01.understanding_data_types;

public class DefiningTextBlocks2 {

    public static void main(String[] args) {


        // Since Java 15, text blocks are available as a standard feature.
        // A text block starts and ends with three double quotes ("""), and the contents don’t need to be escaped.

        String textBlocks1 = """
                Hello TextBlocks
                """;

        System.out.println("----textBlock1----");
        System.out.println(textBlocks1);

        String textBlocks2 = """
                    line1
                """;

        System.out.println("----textBlock2----");
        System.out.println(textBlocks2);


        String textBlocks3 = """
                            line1
                """;
        System.out.println("----textBlock3----");
        System.out.println(textBlocks3);


        String textBlocks4 = """
                line1
                                    """;

        System.out.println("----textBlock4----");
        System.out.println(textBlocks4);

        String textBlocks5 = """
                    line1
                line2
                    """;

        System.out.println("----textBlock5----");
        System.out.println(textBlocks5);

        String textBlocks6 = """
                    line1
                line2
             """;

        System.out.println("----textBlock6----");
        System.out.println(textBlocks6);

        String textBlocks7 = """
                    line1
                line2
                   line3
                            line4      """;

        System.out.println("----textBlock7----");
        System.out.println(textBlocks7);

        String textBlocks8 = """
                    "line1"
                "line2"
                    "line3"
                        "line4"
             """;

        System.out.println("----textBlock8----");
        System.out.println(textBlocks8);

        String textBlocks9 = """
                    \"line1\"
                \"line2\"
                    \"line3\"
                        \"line4\"
                    """;

        System.out.println("----textBlock9----");
        System.out.println(textBlocks9);

    }
}
