package chapter13.identifying_threading_problems;

import java.util.concurrent.Executors;

public record Fox(String name) {

    public void eatAndDrink(Food food, Water water) {
        synchronized (food) {
            System.out.println(name() + " Got Food!");
            move();
            synchronized (water) {
                System.out.println(name() + " Got Water!");
            }
        }
    }

    public void drinkAndEat(Food food, Water water) {
        synchronized (water) {
            System.out.println(name() + " Got Water!");
            move();
            synchronized (food) {
                System.out.println(name() + " Got Food!");
            }
        }
    }

    public void move() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        var foxy = new Fox("Foxy");
        var tails = new Fox("Tails");
        var food = new Food();
        var water = new Water();
// Process data
        var service = Executors.newScheduledThreadPool(10);
        try {
            service.submit(() -> foxy.eatAndDrink(food, water));
            service.submit(() -> tails.drinkAndEat(food, water));
        } finally {
            service.shutdown();
        }
    }
}

class Food {
}

class Water {
}