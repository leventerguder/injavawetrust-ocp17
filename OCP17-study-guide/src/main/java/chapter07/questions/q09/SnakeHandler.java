package chapter07.questions.q09;

abstract class Snake {
}

class Cobra extends Snake {
}

class GardenSnake extends Cobra {
}

public class SnakeHandler {
    private Snake snakey;

    public void setSnake(Snake mySnake) {
        this.snakey = mySnake;
    }

    public static void main(String[] args) {
        new SnakeHandler().setSnake(new Cobra());

        // new SnakeHandler().setSnake(new Snake()); // DOES NOT COMPILE

        // new SnakeHandler().setSnake(new Object()); // DOES NOT COMPILE

        new SnakeHandler().setSnake(new GardenSnake()); // DOES NOT COMPILE

        new SnakeHandler().setSnake(null);

    }
}