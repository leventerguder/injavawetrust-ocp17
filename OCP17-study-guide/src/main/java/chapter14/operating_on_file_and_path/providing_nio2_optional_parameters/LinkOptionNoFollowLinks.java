package chapter14.operating_on_file_and_path.providing_nio2_optional_parameters;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LinkOptionNoFollowLinks {

    public static void main(String[] args) {

        Path path = Paths.get("schedule.xml");
        boolean exists = Files.exists(path, LinkOption.NOFOLLOW_LINKS);
        System.out.println(exists);
    }
}
