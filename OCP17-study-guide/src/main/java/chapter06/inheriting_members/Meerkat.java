package chapter06.inheriting_members;

class Carnivore {
    protected boolean hasFur = false;

    public int size = 1;

    public static int type = 0;
}


public class Meerkat extends Carnivore {
    protected boolean hasFur = true;

    private int size = 2;

    static int type = 1;

    public static void main(String[] args) {
        Meerkat m = new Meerkat();
        Carnivore c = m;
        System.out.println(m.hasFur); // true
        System.out.println(c.hasFur); // false

        System.out.println(m.size); // 2
        System.out.println(c.size); // 1

        System.out.println(m.type); // 1
        System.out.println(c.type); // 0
    }
}
