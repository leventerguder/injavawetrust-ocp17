package chapter06.inheritingmembers;

public class JavanRhino extends Rhino {

    @Override
    public String getName() {
        return "javan rhino";
    }

    //getColor() method does not compile because CharSequence is not a subtype of String. To put it another way, all String
    //values are CharSequence values, but not all CharSequence values are String values.

//    public CharSequence getColor() { // DOES NOT COMPILE
//        return "grey";
//    }
}
