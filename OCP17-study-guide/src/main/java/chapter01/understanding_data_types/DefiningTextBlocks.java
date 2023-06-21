package chapter01.understanding_data_types;

public class DefiningTextBlocks {

    public static void main(String[] args) {

        String eyeTest = "\"Java Study Guide\"\n  by Scott & Jeanne";
        System.out.println(eyeTest);

        // A text block starts and ends with three double quotes ("""), and the contents don’t need to be escaped.
        String textBlock = """
                "Java Study Guide"
                  by Scott & Jeanne
                """;


        System.out.println(textBlock);


        String pyramid = """
          * 
         * *
        * * *
        """;
        System.out.println(pyramid);
        System.out.println("----");


        String pyramid2 = """
              * 
             * *
            * * *
            """;
        System.out.println(pyramid2);
        System.out.println("----");

        String pyramid3 = """
                  * 
                 * *
                * * *
                """;
        System.out.println(pyramid3);
        System.out.println("----");

        // Text blocks require a line break after the opening """, making this one invalid.

        // String block = """doe"""; // DOES NOT COMPILE

        String block = """
            doe \
            deer""";

        // The output is doe deer since the \ tells Java not to add a new line before deer.

        System.out.println(block);
        System.out.println("----");

        String block2 = """
            doe \n
            deer""";

        System.out.println(block2);
        System.out.println("----");

        String block3 = """
          "doe\"\"\"
          \"deer\"""
         """;

        System.out.println(block3);
        // All of the \" escape the ".

        String block4 = """
          "doe""\"
          "deer""\"
         """;

        System.out.println(block4);

        System.out.println("----");

        String block5= """
                a""";
        System.out.println(block5.length());
        System.out.println(block5.toCharArray());

        String block6= """
                a
                """;

        System.out.println("----");
        System.out.println(block6.length());
        System.out.println(block6.toCharArray());


        String block7= """
                a\n
                """;

        System.out.println("----");
        System.out.println(block7.length());
        System.out.println(block7.toCharArray());


        System.out.println("----");
    }
}
