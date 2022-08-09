package chapter11.automatingresourcemanagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IntroducingTryWithResources {

    public void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream(file);
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public void readFileV2(String file) {

        try (FileInputStream is = new FileInputStream(file)) {
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
