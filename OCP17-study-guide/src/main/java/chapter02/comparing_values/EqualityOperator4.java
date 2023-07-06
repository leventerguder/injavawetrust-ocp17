package chapter02.comparing_values;

import java.io.File;

public class EqualityOperator4 {

    public static void main(String[] args) {

        var monday = new File("schedule.txt");
        var tuesday = new File("schedule.txt");
        var wednesday = tuesday;
        System.out.println(monday == tuesday); // false
        System.out.println(tuesday == wednesday); // true

        StringBuilder sb1 = new StringBuilder("hello");

        StringBuilder sb2 = new StringBuilder("hello");

        System.out.println(sb1 == sb2);
    }
}
