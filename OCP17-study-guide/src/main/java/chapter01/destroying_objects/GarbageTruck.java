package chapter01.destroying_objects;

// OCP6 Book
public class GarbageTruck {

    public static void main(String[] args) {

        //### Nulling a Reference ###
        /*
        , an object becomes eligible for garbage collection when there are no more reachable references to it.
        Obviously, if there are no reachable references, it doesn't matter what happens to the object.
        For our purposes it is just floating in space, unused, inaccessible, and no longer needed.
         */

        StringBuffer sb = new StringBuffer("hello");
        System.out.println(sb);
        // The StringBuffer object is not eligible for collection
        sb = null;
        // Now the StringBuffer object is eligible for collection
    }
}
