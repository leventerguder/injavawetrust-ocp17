package chapter01.destroying_objects;

// OCP6 Book
public class GarbageTruck2 {

    public static void main(String[] args) {

        // ### Reassigning a Reference Variable ###
        // We can also decouple a reference variable from an object by setting
        // the reference variable to refer to another object

        StringBuffer s1 = new StringBuffer("hello");
        StringBuffer s2 = new StringBuffer("goodbye");
        System.out.println(s1);
        // At this point the StringBuffer "hello" is not eligible
        s1 = s2; // Redirects s1 to refer to the "goodbye" object
        // Now the StringBuffer "hello" is eligible for collection
    }
}
