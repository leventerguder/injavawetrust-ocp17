package chapter04.using_the_stringbuilder_class;

public class MutabilityAndChaining {

    public static void main(String[] args) {

        mutability();
        mutability2();
    }

    private static void mutability() {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end"); // "start+middle+end"

        System.out.println(sb);
        System.out.println(same);

        System.out.println(sb == same);
    }

    private static void mutability2() {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println(a == b);
    }
}
