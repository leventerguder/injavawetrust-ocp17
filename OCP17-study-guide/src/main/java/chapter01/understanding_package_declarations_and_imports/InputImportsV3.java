package chapter01.understanding_package_declarations_and_imports;


import java.nio.*; // NO GOOD - a wildcard only matches class names, not "file.Files"
// import java.nio.*.*; // NO GOOD - you can only have one wildcard and it must be at the end
import java.nio.file.Paths.*; //  // NO GOOD - you cannot import methods only class names

public class InputImportsV3 {

//    public void read(Files files) {
//        Paths.get("name");
//    }
}
