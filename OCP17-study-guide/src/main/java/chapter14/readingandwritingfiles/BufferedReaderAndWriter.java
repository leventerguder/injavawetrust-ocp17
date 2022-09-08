package chapter14.readingandwritingfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferedReaderAndWriter {


    private void copyPath(Path input, Path output) throws IOException {
        try (var reader = Files.newBufferedReader(input);
             var writer = Files.newBufferedWriter(output)) {

            String line = null;

            while ((line = reader.readLine()) != null) writer.write(line);
            writer.newLine();
        }
    }
}

