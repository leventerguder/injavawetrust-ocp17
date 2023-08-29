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

        List<? super IOException> exceptions2 = new ArrayList<IOException>();

        // exceptions2.add(new Exception()); // DOES NOT COMPILE
        exceptions2.add(new IOException());
        exceptions2.add(new FileNotFoundException());

        List<? super IOException> exceptions3 = new ArrayList<Object>();

        // exceptions3.add(new Object());
        // exceptions3.add(new Exception()); // DOES NOT COMPILE
        exceptions3.add(new IOException());
        exceptions3.add(new FileNotFoundException());

        // List<? super IOException> exception4 = new ArrayList<FileNotFoundException>(); // DOES NOT COMPILE
    }

}
