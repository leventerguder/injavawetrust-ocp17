package chapter14.operating_on_file_and_path.providing_nio2_optional_parameters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LinkOptionNoFollowLinks {

    public static void main(String[] args) throws IOException {

        Path newLink = Paths.get("schedule.xml");
        Path target = Path.of("another-schedule.xml");

        //Files.createFile(target);

        Files.createSymbolicLink(newLink, target);
        System.out.println("Files.exists: " + Files.exists(newLink));
        System.out.println("isSymbolicLink :" + Files.isSymbolicLink(newLink));
        System.out.println("Files.exists#NOFOLLOW_LINKS : " + Files.exists(newLink, LinkOption.NOFOLLOW_LINKS));
        System.out.format("Target of link" + " '%s' is '%s'%n", newLink, Files.readSymbolicLink(newLink));
    }
}
