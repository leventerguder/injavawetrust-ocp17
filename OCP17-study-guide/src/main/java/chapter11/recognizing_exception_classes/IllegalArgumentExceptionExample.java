package chapter11.recognizing_exception_classes;

public class IllegalArgumentExceptionExample {

    private int numberEggs;

    public void setNumberEggs(int numberEggs) {
        if (numberEggs < 0)
            throw new IllegalArgumentException("# eggs must not be negative");
        this.numberEggs = numberEggs;
    }


    public static void main(String[] args) {
        var iaee = new IllegalArgumentExceptionExample();
        iaee.setNumberEggs(-2);
    }
}
