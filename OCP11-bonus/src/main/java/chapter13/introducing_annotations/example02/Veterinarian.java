package chapter13.introducing_annotations.example02;

import chapter13.introducing_annotations.example01.Lion;

public class Veterinarian {
    @ZooAnimal(habitat = "Infirmary")
    private Lion sickLion;
    @ZooAnimal(habitat = "Safari")
    private Lion healthyLion;
    @ZooAnimal(habitat = "Special Enclosure")
    private Lion blindLion;
}