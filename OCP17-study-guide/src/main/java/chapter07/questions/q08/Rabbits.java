package chapter07.questions.q08;

public class Rabbits {

    private int numRabbits = 0;

    public void multiply() {
        numRabbits *= 6;
    }

    public int getNumberOfRabbits() {
        return numRabbits;
    }
}

class Rabbits2 {

    private int numRabbits = 0;

    protected void multiply() {
        numRabbits *= 6;
    }

    private int getNumberOfRabbits() {
        return numRabbits;
    }
}

class Rabbits3 {

    private int numRabbits = 0;

    private void multiply() {
        numRabbits *= 6;
    }

    protected int getNumberOfRabbits() {
        return numRabbits;
    }
}
