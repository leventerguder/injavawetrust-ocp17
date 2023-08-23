package chapter09.using_the_set_interface;

import java.util.Set;

public class SetCopyOfExample {

    public static void main(String[] args) {

        Set<String> keys = Set.of("key1", "key2");

        // keys.add("UnsupportedOperationException"); //  java.lang.UnsupportedOperationException
        Set<String> copiedImmutableSet = Set.copyOf(keys);

        System.out.println(copiedImmutableSet);
        System.out.println(copiedImmutableSet.getClass());

        // copiedImmutableSet.add("UnsupportedOperationException");
    }
}
