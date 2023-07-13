package chapter04.using_the_stringbuilder_class;

public class StringBuilderDeleteContents {

    public static void main(String[] args) {

        delete1();
        delete2();
        deleteCharAt();
        //deleteCharAt2();

    }

    private static void delete1() {
        var sb = new StringBuilder("abcdef");
        sb.delete(1, 3); // sb = adef
        System.out.println(sb);
    }

    /*
    The delete() method is more flexible than some others when it comes to array indexes.
    If you specify a second parameter that is past the end of the StringBuilder,
    Java will just assume you meant the end.
     */
    private static void delete2() {
        var sb = new StringBuilder("abcdef");
        sb.delete(1, 100); // sb = a
        System.out.println(sb);
    }

    private static void deleteCharAt() {
        var sb = new StringBuilder("abcdef");
        sb.deleteCharAt(3);
        System.out.println(sb);
    }

    private static void deleteCharAt2() {
        var sb = new StringBuilder("abcdef");
        sb.deleteCharAt(6); // StringIndexOutOfBoundsException: index 6, length 6
        System.out.println(sb);
    }
}
