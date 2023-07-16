package chapter04.understanding_arrays;

public class MultipleArraysInDeclarations {

    public static void main(String[] args) {

        int[] ids, types;
        int ids2[], types2;

        ids = new int[3];
        types = new int[5];

        ids2 = new int[3];
        // types2 = new int[5]; // DOES NOT COMPILE
    }
}
