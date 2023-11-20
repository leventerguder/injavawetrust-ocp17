package chapter14.serializing_data.ensuring_that_a_class_is_serializable;

import java.io.Serializable;

public class Tail implements Serializable {
    private Fur fur = new Fur();
}
