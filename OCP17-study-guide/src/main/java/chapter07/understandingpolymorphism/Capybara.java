package chapter07.understandingpolymorphism;

public class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        // var capybara = (Capybara) rodent; // ClassCastException

        if (rodent instanceof Capybara) {
            // Do stuff
        }
    }
}