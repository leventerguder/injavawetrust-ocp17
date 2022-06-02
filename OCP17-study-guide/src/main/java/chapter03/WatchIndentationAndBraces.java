package chapter03;

public class WatchIndentationAndBraces {

    public static void main(String[] args) {


        int hourOfDay = 12;
        int morningGreetingCount = 0;

        if (hourOfDay < 11)
            System.out.println("Good Morning");
            morningGreetingCount++;
            System.out.println(morningGreetingCount);

        /*
        Based on the indentation, you might be inclined to think the variable morningGreetingCount is only going to be
        incremented if hourOfDay is less than 11, but that’s not what this code does. It will execute the print statement only
        if the condition is met, but it will always execute the increment operation.
         */

    }

}
