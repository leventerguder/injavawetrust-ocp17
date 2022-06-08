package chapter04;

public class StringBuilderInsertingData {

    public static void main(String[] args) {

        var sb = new StringBuilder("animals");
        sb.insert(7, "-"); // animals-
        sb.insert(0, "-"); // -animals-
        sb.insert(4, "-"); // -ani-mals-
        System.out.println(sb);
    }
}
