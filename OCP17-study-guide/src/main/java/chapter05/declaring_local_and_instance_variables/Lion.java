package chapter05.declaring_local_and_instance_variables;

public class Lion {
    int hunger = 4;

    public int feedZooAnimals() {
        int snack = 10; // Local variable
        if (snack > 4) {
            long dinnerTime = snack++;
            hunger--;
        }
        return snack;
    }
}
