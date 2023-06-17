package chapter07.implementing_interfaces;

public class Skip {

    public int skip() {
        return Hop.getJumpHeight();
    }

    public static void main(String[] args) {
        Skip s = new Skip();
        System.out.println(s.skip());
    }
}
