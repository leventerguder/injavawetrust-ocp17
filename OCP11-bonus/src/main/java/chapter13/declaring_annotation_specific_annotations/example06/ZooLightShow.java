package chapter13.declaring_annotation_specific_annotations.example06;

import java.io.IOException;

public class ZooLightShow {

    /**
     * Performs a light show at the zoo.
     *
     * @param distance length the light needs to travel
     * @return the result of the light show
     * @author Grace Hopper
     * @since 1.5
     * @deprecated Use EnhancedZooLightShow.lights() instead
     * @throws IOException  If an input or output exception occurred
     */

    @Deprecated(since = "1.5")
    public static String perform(int distance) throws IOException {
        return "Beginning light show";
    }

    // https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html

    // https://github.com/spring-projects/spring-framework/blob/main/spring-context/src/main/java/org/springframework/context/annotation/Configuration.java
    // https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Configuration.html
}
