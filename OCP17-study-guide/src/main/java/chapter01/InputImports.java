package chapter01;

// Use a wildcard to import both at the same time.
// import java.nio.file.*;

// Import both classes explicitly.

import java.nio.file.Files;
import java.nio.file.Paths;

// No GOOD - a wildcard only matches class names, not "file.Files"

import java.nio.*;

// No Good - you can only have one wildcard and it must be at the end.
//import java.nio.*.*;

// No Good - you cannot import methods only class names.
import java.nio.file.Paths.*;

public class InputImports {

    public void read(Files files) {
        Paths.get("name");
    }

}
