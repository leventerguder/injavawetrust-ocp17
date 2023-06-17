package chapter01.understanding_package_declarations_and_imports;

//import java.util.Random;
//import java.util.List;
//import java.util.ArrayList;

import java.util.*;

public class NumberPicker2 {

    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        list.add(r.nextInt(10));
        list.add(r.nextInt(20));
    }
}