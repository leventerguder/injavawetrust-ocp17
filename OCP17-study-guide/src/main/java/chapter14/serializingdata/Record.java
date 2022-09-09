package chapter14.serializingdata;

import java.io.Serializable;

record Record(String name) implements Serializable {
}