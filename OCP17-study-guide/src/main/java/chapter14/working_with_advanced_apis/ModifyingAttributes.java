package chapter14.working_with_advanced_apis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class ModifyingAttributes {
    public static void main(String[] args) throws IOException {
        // Read file attributes
        var path = Paths.get("extras/chapter14/turtles/sea.txt");
        BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        BasicFileAttributes attributes = view.readAttributes();

        // Modify file last modified time
        FileTime lastModifiedTime = FileTime.fromMillis(attributes.lastModifiedTime().toMillis() + 10_000);
        view.setTimes(lastModifiedTime, null, null);

    }
}
