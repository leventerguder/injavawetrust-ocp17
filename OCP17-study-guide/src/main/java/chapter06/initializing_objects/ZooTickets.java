package chapter06.initializing_objects;

public class ZooTickets {
    private String name = "BestZoo";

    {
        System.out.print(name + "-");
    }

    private static int COUNT = 0;

    static {
        System.out.print(COUNT + "-");
    }

    static {
        COUNT += 10;
        System.out.print(COUNT + "-");
    }

    public ZooTickets() {
        System.out.print("z-");
    }

    public static void main(String... patrons) {
        new ZooTickets();
    }
}