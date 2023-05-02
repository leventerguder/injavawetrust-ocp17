package chapter01.destroying_objects;

import java.util.Date;


// OCP6 Book
public class GarbageFactory {

    /*
     If an object is returned from the method,
     its reference might be assigned to a reference variable in the method that called it;
     hence, it will not be eligible for collection.
     */
    public static void main(String[] args) {
        Date d = getDate();
        doComplicatedStuff();
        System.out.println("d = " + d);
    }

    public static Date getDate() {
        Date d2 = new Date();
        StringBuffer now = new StringBuffer(d2.toString());
        System.out.println(now);
        return d2;
    }

    private static void doComplicatedStuff() {
    }
}
