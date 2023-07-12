package chapter04.creating_and_manipulating_strings;

public class RemovingWhitespace {

    public static void main(String[] args) {

        stripWhiteSpace();

        trimWhiteSpace();

        stripTabCharacter();

        trimTabCharacter();

        stripSpecialCharacters();

        trimSpecialCharacters();

        trimUnicodeContent();

        stripUnicodeContent();
    }

    private static void stripWhiteSpace() {
        System.out.println("##### stripWhiteSpace #####");
        System.out.println("abc".strip());  //abc
        System.out.println(" abc ".strip()); //abc
        System.out.println(" abc ".strip().length()); //3
    }

    private static void trimWhiteSpace() {
        System.out.println("##### trimWhiteSpace #####");
        System.out.println("abc".strip());  //abc
        System.out.println(" abc ".strip()); //abc
        System.out.println(" abc ".strip().length()); //3
    }

    private static void stripTabCharacter() {
        System.out.println("##### stripTabCharacter #####");
        String text = " abc\t ";
        System.out.println(text.strip()); //abc
        System.out.println(text.strip().length());   //3
        System.out.println(text.stripLeading().length()); //5
        System.out.println(text.stripTrailing().length()); //4
    }


    private static void trimTabCharacter() {
        System.out.println("##### trimTabCharacter #####");
        String text = " abc\t ";
        System.out.println(text.trim()); //abc
        System.out.println(text.trim().length());   //3
    }


    private static void stripSpecialCharacters() {
        System.out.println("##### stripSpecialCharacters #####");
        String contentWithTab = "\t   a b c\n \r";
        System.out.println(contentWithTab);
        System.out.println(contentWithTab.length()); //12

        System.out.println(contentWithTab.strip());   // a b c
        System.out.println(contentWithTab.strip().length());   //5
    }

    private static void trimSpecialCharacters() {
        System.out.println("##### trimSpecialCharacters #####");
        String contentWithTab = "\t   a b c\n \r";
        System.out.println(contentWithTab);
        System.out.println(contentWithTab.length()); //12

        System.out.println(contentWithTab.trim());   //a b c
        System.out.println(contentWithTab.trim().length());   //5
    }

    private static void trimUnicodeContent() {
        System.out.println("##### trimUnicodeContent #####");
        String content = "\u2000abc\u2000";
        System.out.println(content);
        System.out.println(content.trim()); // DOES NOT SUPPORT Unicode
    }

    private static void stripUnicodeContent() {
        System.out.println("##### stripUnicodeContent #####");
        char ch = '\u2000';
        String content = "\u2000abc\u2000";
        System.out.println(content);
        System.out.println(content.strip());
    }
}
