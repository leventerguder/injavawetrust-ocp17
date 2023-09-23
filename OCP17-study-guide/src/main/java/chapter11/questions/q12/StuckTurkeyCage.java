package chapter11.questions.q12;

import java.io.FileNotFoundException;

public class StuckTurkeyCage implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new FileNotFoundException("Cage not closed");
    }


    public static void main(String[] args) throws Exception {

        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }

    void method() {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");
        } catch (Exception e) {
            // handle
        }
    }
}
