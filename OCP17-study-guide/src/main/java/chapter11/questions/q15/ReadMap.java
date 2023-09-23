package chapter11.questions.q15;

import java.util.Locale;

public class ReadMap implements AutoCloseable {

    private Locale locale;
    private boolean closed = false;

    @Override
    public void close() throws Exception {
        System.out.println("Folding map");
        locale = null;
        closed = true;
    }

    public void open() {
        this.locale = new Locale("qw");
    }

    public void openV2() {
        this.locale = new Locale("wp", "VW");
    }

    public void use() {
        // Implementation omitted
    }
}
