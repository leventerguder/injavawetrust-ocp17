package chapter01.understanding_data_types;

public class TextBlocks {

    public static void main(String[] args) {

        String textBlocks1 = """
                Hello TextBlocks
                """;
        System.out.println(textBlocks1);

        String textBlocks2 = """
                    line1
                line2
                    line3
                            line4
                """;
        System.out.println(textBlocks2);

        String textBlocks3 = """
                    "line1"
                "line2"
                    "line3"
                        "line4"
                """;
        System.out.println(textBlocks3);


        String textBlocks4 = """
                    \"line1\"
                \"line2\"
                    \"line3\"
                        \"line4\"
                """;
        System.out.println(textBlocks4);

        /*
        Imagine a vertical line drawn on the leftmost non-whitespace character in your text block.
        Everything to the left of it is incidental whitespace, and everything to the right is essential whitespace.
         */

        String pyramid = """
            *
           * * 
          * * *
      """; //The left most characters, so the line is drawn at the leftmost position.

        System.out.print(pyramid);

    }
}
