package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.moving_or_renaming_paths_with_move;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMove2 {

    public static void main(String[] args) throws IOException {

        Files.move(Path.of("extras/chapter14/user/addresses.txt"),
                Path.of("extras/chapter14/zoo-new/addresses2.txt"));
    }
}
