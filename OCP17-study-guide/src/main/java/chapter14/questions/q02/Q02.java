package chapter14.questions.q02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q02 {

//    Assuming that / is the root directory within the file system, which of the following are true statements? (Choose all that apply.)
//+++    A. /home/parrot is an absolute path.
//    B. /home/parrot is a directory.
//    C. /home/parrot is a relative path.
//    D. new File("/home") will throw an exception if /home does not exist.
//    E. new File("/home").delete() will throw an exception if /home does not exist.
//++    F. A Reader offers character encoding, making it more useful when working with String data than an InputStream.
//    G. A Reader offers multithreading support, making it more useful than an InputStream.

// Paths that begin with the root directory are absolute paths.
// Option B is incorrect because the path could be a file or directory within the file system.
// The delete method returns false if the file or directory cannot be deleted.
// Character stream classes often include built-in convenience methods for working with String data.

    public static void main(String[] args) throws IOException {

        File file = new File("/missing-path");
        new File("/missing-path").delete();


        BufferedReader reader = new BufferedReader(new FileReader("extras/chapter14/zoo.txt"));
        String line1 = reader.readLine();
    }
}
