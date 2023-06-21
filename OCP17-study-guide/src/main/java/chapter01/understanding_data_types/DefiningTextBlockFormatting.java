package chapter01.understanding_data_types;

public class DefiningTextBlockFormatting {

    public static void main(String[] args) {

        String textBlock1 = """
                    \"sample"
                """;

        System.out.println(textBlock1);

        String textBlock2 = """
                    \"""line1"
                """;

        System.out.println(textBlock2);

        String textBlock3 = """
                    \"\"\"line1"
                """;

        System.out.println(textBlock3);


        String textBlock4 = """
                    \\\\\\line1"
                """;

        System.out.println(textBlock4);

        String textBlock5 = """
                \s\s\sline1                
                """;

        System.out.println(textBlock5);

        String textBlock6 = """
                line1 \
                    line1-part2 \
                  line1-part3             
                """;

        System.out.println(textBlock6);

    }
}
