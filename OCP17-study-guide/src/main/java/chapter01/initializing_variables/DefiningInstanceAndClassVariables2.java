package chapter01.initializing_variables;

import java.util.List;

public class DefiningInstanceAndClassVariables2 {

    public static void main(String[] args) {

        Sample sample = new Sample();

        System.out.println(sample);
    }
}

class Sample {

    int number;
    boolean activated;

    long size;

    double square;

    String name;
    List<Integer> cofigs;

    static Object lock;

    char c;

    @Override
    public String toString() {
        return "Sample{" +
                "number=" + number +
                ", activated=" + activated +
                ", size=" + size +
                ", square=" + square +
                ", name=" + name +
                ", cofigs=" + cofigs +
                ", c=" + c +
                '}';
    }
}