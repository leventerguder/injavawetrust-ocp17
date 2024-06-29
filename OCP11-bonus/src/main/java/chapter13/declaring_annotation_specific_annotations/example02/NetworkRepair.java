package chapter13.declaring_annotation_specific_annotations.example02;

import java.util.function.Predicate;

public class NetworkRepair {
    class OutSrc extends @Technical NetworkRepair {
    }

    // @Technical // DOES NOT COMPILE
    @TechnicalMethod
    public void repair() {
        var repairSubclass = new @Technical NetworkRepair() {
        };
        var o = new @Technical NetworkRepair().new @Technical
                OutSrc();
        int remaining = (@Technical int) 10.0;
    }

    @Technical
    @TechnicalMethod
    // @TechnicalConstructor // DOES NOT COMPILE
    public int value() {
        return 10;
    }

    @Technical
    // @TechnicalMethod // DOES NOT COMPILE
    // @TechnicalConstructor // DOES NOT COMPILE
    private int size = 100;

    @Technical
    @TechnicalConstructor
    // @TechnicalMethod // DOES NOT COMPILE
    public NetworkRepair() {

    }
}