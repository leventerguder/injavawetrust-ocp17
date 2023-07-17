package chapter04.questions.q05;

public class Q05 {

    public static void main(String[] args) {

        var sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb); // abbaccca

    }
}
