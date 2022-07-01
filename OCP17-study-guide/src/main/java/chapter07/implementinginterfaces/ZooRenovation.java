package chapter07.implementinginterfaces;

public interface ZooRenovation {
    public String projectName();

    abstract String status();

    default void printStatus() {
        System.out.print("The " + projectName() + " project " + status());
    }
}

