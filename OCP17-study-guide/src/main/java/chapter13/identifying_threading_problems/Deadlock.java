package chapter13.identifying_threading_problems;

public class Deadlock {

    // Deadlock describes a situation where two or more threads are blocked forever, waiting for each other.
    // https://docs.oracle.com/javase/tutorial/essential/concurrency/deadlock.html

    /*
    Alphonse and Gaston are friends, and great believers in courtesy.
    A strict rule of courtesy is that when you bow to a friend,
    you must remain bowed until your friend has a chance to return the bow.
    Unfortunately, this rule does not account for the possibility that two friends
    might bow to each other at the same time.
    This example application, Deadlock, models this possibility:
     */
    static class Friend {
        private final String name;

        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public synchronized void bow(Friend bower) {
            System.out.format("%s: %s" + "  has bowed to me!%n", this.name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower) {
            System.out.format("%s: %s" + " has bowed back to me!%n", this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");

        new Thread(new Runnable() {
            public void run() {
                alphonse.bow(gaston);
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                gaston.bow(alphonse);
            }
        }).start();
    }
}
