package chapter05;

public class EffectivelyFinalVariables {

    //  In this example, name and wet are effectively final and can be updated with the final modifier, but not size.
    public String zooFriends() {
        String name = "Harry the Hippo";
        var size = 10;
        boolean wet;
        if (size > 100) size++;
        name.substring(0);
        wet = true;
        return name;
    }
}
