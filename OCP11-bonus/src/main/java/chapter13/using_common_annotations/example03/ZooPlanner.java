package chapter13.using_common_annotations.example03;

/**
 * Design and plan a zoo.
 *
 * @deprecated Use ParkPlanner instead.
 */
@Deprecated
public class ZooPlanner {

    /**
     * Method to formulate a zoo layout.
     *
     * @deprecated Use {@link ParkPlanner#planPark(String... data) instead.
     */
    @Deprecated(since = "1.8", forRemoval = true)
    public void plan() {
    }

    @Deprecated
    private static final int capacity = 1000;
}