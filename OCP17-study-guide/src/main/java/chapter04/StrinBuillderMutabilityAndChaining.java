package chapter04;

public class StrinBuillderMutabilityAndChaining {

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
    }

    private static void mutability2() {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
