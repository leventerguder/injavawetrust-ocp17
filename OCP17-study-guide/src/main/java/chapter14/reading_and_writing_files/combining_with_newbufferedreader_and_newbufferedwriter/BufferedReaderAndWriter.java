package chapter14.reading_and_writing_files.combining_with_newbufferedreader_and_newbufferedwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BufferedReaderAndWriter {

    public static void main(String[] args) throws IOException {

        Path input = Path.of("extras/chapter14/content-data.txt");
        Path output = Path.of("extras/chapter14/content-data-out.txt");

        copyPath(input, output);
    }

    private static void copyPath(Path input, Path output) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(input);
             BufferedWriter writer = Files.newBufferedWriter(output)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.newLine();
        }
    }
}

