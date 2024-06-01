package chapter13.declaring_annotation_specific_annotations.example05;

public class ZooLightShow {

    /**
     * Performs a light show at the zoo.
     *
     * @param distance length the light needs to travel
     * @return the result of the light show
     * @author Grace Hopper
     * @since 1.5
     * @deprecated Use EnhancedZooLightShow.lights() instead
     */

    @Deprecated(since = "1.5")
    public static String perform(int distance) {
        return "Beginning light show";
    }
}
