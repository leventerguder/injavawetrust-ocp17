package chapter03.questions.q26;

public class Q26 {

    public static void main(String[] args) {

        int w = 0, r = 1;
        String name = "";

        while (w < 2) {
            name += "A";
            do {
                name += "B";
                if (name.length() > 0) name += "C";
                else break;
            } while (r <= 1);
            r++;
            w++;
        }
        System.out.println(name);
    }
}
