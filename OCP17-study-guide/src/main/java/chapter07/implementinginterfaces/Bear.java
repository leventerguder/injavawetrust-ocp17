package chapter07.implementinginterfaces;

// Java supports inheriting two abstract methods that have compatible method declarations.
public class Bear implements Herbivore, Omnivore {
    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
