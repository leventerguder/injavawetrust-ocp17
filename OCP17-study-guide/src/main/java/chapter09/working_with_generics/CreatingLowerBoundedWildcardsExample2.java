package chapter09.working_with_generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreatingLowerBoundedWildcardsExample2 {

    public static void main(String[] args) {

        List<? super IOException> exceptions = new ArrayList<Exception>();

        // exceptions.add(new Exception()); // DOES NOT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
    }

}
