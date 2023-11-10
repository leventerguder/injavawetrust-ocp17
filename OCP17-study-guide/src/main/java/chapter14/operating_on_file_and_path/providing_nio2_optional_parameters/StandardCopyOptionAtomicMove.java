package chapter14.operating_on_file_and_path.providing_nio2_optional_parameters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class StandardCopyOptionAtomicMove {

    void copy(Path source, Path target) throws IOException {
        Files.move(source, target,
                LinkOption.NOFOLLOW_LINKS,
                StandardCopyOption.ATOMIC_MOVE);
    }
}
