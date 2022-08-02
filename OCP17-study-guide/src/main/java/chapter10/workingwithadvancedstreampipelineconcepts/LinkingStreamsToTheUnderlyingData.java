package chapter10.workingwithadvancedstreampipelineconcepts;

import java.util.ArrayList;

public class LinkingStreamsToTheUnderlyingData {

    public static void main(String[] args) {

        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");

        var stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count()); // 3
        // The correct answer is 3. Remember that streams are lazily evaluated.
    }
}
