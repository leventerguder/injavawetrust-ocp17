package chapter01;

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
    }
}
