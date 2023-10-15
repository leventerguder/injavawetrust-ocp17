package chapter12.questions.q09;

public class Q09 {
    // Suppose you are creating a service provider that contains the following class.
    // Which line of code needs to be in your module-info.java?


    //package dragon;
    //import magic.*;
    //
    //public class Dragon implements Magic {
    //    public String getPower() {
    //        return "breathe fire";
    //    }
    //}


    // F. provides magic.Magic with dragon.Dragon;

    // The provides directive takes the interface name first and the implementing class
    // name second and also uses with.
}
