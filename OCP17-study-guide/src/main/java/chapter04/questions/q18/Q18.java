package chapter04.questions.q18;

public class Q18 {

    public static void main(String[] args) {

        String s1 = """
                purr""";
        String s2 = "";

        s1.toUpperCase();
        s1.trim();
        s1.substring(1, 3);

        s1 += "two";
        s2 += 2;
        s2 += 'c';
        s2 += false;

        if (s2 == "2cfalse") System.out.println("==");

        if (s2.equals("2cfalse")) System.out.println("equals"); // equals

        System.out.println(s1.length()); //7
    }
}
