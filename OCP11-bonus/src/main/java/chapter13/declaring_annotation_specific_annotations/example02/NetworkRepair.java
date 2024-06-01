package chapter13.declaring_annotation_specific_annotations.example02;

import java.util.function.Predicate;

public class NetworkRepair {
    class OutSrc extends @Technical NetworkRepair {
    }

    public void repair() {
        var repairSubclass = new @Technical NetworkRepair() {
        };
        var o = new @Technical NetworkRepair().new @Technical
                OutSrc();
        int remaining = (@Technical int) 10.0;
    }
}