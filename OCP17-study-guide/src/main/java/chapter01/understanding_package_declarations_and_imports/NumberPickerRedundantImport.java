package chapter01.understanding_package_declarations_and_imports;

import java.lang.System; // Redundant Import
import java.lang.*; // Redundant Import
import java.util.Random;
import java.util.*; // Redundant Import

public class NumberPickerRedundantImport {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}