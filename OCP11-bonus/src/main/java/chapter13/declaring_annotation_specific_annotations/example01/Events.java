package chapter13.declaring_annotation_specific_annotations.example01;


// @ZooAttraction // DOES NOT COMPILE
class RollerCoaster {
}

public class Events {

    @ZooAttraction
    String rideTrain() {
        //return (@ZooAttraction String)"Fun!"; // DOES NOT COMPILE
        // does not compile, because it is not permitted on a cast operation.
        return null;

    }

    // The first annotation is permitted,
    // because it is applied to the constructor declaration

    // The second annotation is not,
    // as the annotation is not marked for use in a constructor parameter.
    @ZooAttraction
    //Events(@ZooAttraction  String description) { // DOES NOT COMPILE
    Events(String description) { // DOES NOT COMPILE
        super();
    }

    //This is not permitted,
    // because it cannot be applied to fields or variables.

    // @ZooAttraction  // DOES NOT COMPILE
    int numPassengers;

}
