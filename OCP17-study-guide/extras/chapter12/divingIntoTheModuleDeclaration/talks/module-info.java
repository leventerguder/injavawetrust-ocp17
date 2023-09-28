module zoo.animal.talks {
    exports zoo.animal.talks.content to zoo.staff;
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;

    // requires zoo.animal.feeding; // no longer needed
    // requires zoo.animal.care;    // no longer needed

    requires transitive zoo.animal.care;
}
