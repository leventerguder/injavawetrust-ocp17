package chapter06.questions.q24;

class Antelope {
    public Antelope(int p) {
        System.out.print("4");
    }

    {
        System.out.print("2");
    }

    static {
        System.out.print("1");
    }
}

public class Gazelle extends Antelope {
    public Gazelle(int p) {
        super(6);
        System.out.print("3");
    }

    public static void main(String[] args) {
        new Gazelle(0); // 182493
    }

    static {
        System.out.print("8");
    }

    {
        System.out.print("9");
    }
}
