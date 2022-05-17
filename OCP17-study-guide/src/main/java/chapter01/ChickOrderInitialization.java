package chapter01;

public class ChickOrderInitialization {

    /*
    Order matters for the fields and blocks of code.
    You can’t refer to a variable before it has been defined:
     */

    /*
    {
        System.out.println(name); // DOES NOT COMPILE private String name = "Fluffy";
    }
    */


    private String name = "Fluffy";

    {
        System.out.println("setting field");
    }

    public ChickOrderInitialization() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        ChickOrderInitialization chick = new ChickOrderInitialization();
        System.out.println(chick.name);
    }

}
