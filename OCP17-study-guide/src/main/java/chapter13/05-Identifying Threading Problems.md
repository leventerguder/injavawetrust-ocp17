# Identifying Threading Problems

A threading problem can occur in multithreaded applications when two or more threads interact in an unexpected and
undesirable way. For example, two threads may block each other from accessing a particular segment of code.

The Concurrency API was created to help eliminate potential threading issues common to all developers. As you have seen,
the Concurrency API creates threads and manages complex thread interactions for you, often in just a few lines of code.

## Understanding Liveness

As you have seen in this chapter, many thread operations can be performed independently, but some require coordination.
For example, synchronizing on a method requires all threads that call the method to wait for other threads to finish
before continuing.

What happens to the application while all of these threads are waiting? In many cases, the waiting is ephemeral, and the
user has very little idea that any delay has occurred. In other cases, though, the waiting may be extremely long,
perhaps infinite.

Liveness is the ability of an application to be able to execute in a timely manner. Liveness problems, then, are those
in which the application becomes unresponsive or is in some kind of “stuck” state. More precisely, liveness problems are
often the result of a thread entering a BLOCKING or WAITING state forever, or repeatedly entering/exiting these states.
For the exam, there are three types of liveness issues with which you should be familiar: deadlock, starvation, and
livelock.

### Deadlock

Deadlock occurs when two or more threads are blocked forever, each waiting on the other. We can illustrate this
principle with the following example. Imagine that our zoo has two foxes: Foxy and Tails. Foxy likes to eat first and
then drink water, while Tails likes to drink water first and then eat. Furthermore, neither animal likes to share, and
they will finish their meal only if they have exclusive access to both food and water.

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

In this example, Foxy obtains the food and then moves to the other side of the environment to obtain the water.
Unfortunately, Tails already drank the water and is waiting for the food to become available. The result is that our
program outputs the following, and it hangs indefinitely:

    Foxy Got Food! 
    Tails Got Water!

This example is considered a deadlock because both participants are permanently blocked, waiting on resources that will
never become available.

### Starvation

Starvation occurs when a single thread is perpetually denied access to a shared resource or lock. The thread is still
active, but it is unable to complete its work as a result of other threads constantly taking the resource that it is
trying to access.

In our fox example, imagine that we have a pack of very hungry, very competitive foxes in our environment. Every time
Foxy stands up to go get food, one of the other foxes sees her and rushes to eat before her. Foxy is free to roam around
the enclosure, take a nap, and howl for a zookeeper but is never able to obtain access to the food. In this example,
Foxy literally and figuratively experiences starvation. It’s a good thing that this is just a theoretical example!

### Livelock

Livelock occurs when two or more threads are conceptually blocked forever, although they are each still active and
trying to complete their task. Livelock is a special case of resource starvation in which two or more threads actively
try to acquire a set of locks, are unable to do so, and restart part of the process.

Livelock is often a result of two threads trying to resolve a deadlock. Returning to our fox example, imagine that Foxy
and Tails are both holding their food and water resources, respectively. They each realize that they cannot finish their
meal in this state, so they both let go of their food and water, run to the opposite side of the environment, and pick
up the other resource. Now Foxy has the water, Tails has the food, and neither is able to finish their meal!

If Foxy and Tails continue this process forever, it is referred to as livelock. Both Foxy and Tails are active, running
back and forth across their area, but neither can finish their meal. Foxy and Tails are executing a form of failed
deadlock recovery. Each fox notices that they are potentially entering a deadlock state and responds by releasing all of
its locked resources. Unfortunately, the lock and unlock process is cyclical, and the two foxes are conceptually
deadlocked.

In practice, livelock is often a difficult issue to detect. Threads in a livelock state appear active and able to
respond to requests, even when they are stuck in an endless cycle.

## Managing Race Conditions

A race condition is an undesirable result that occurs when two tasks that should be completed sequentially are
completed at the same time. We encountered examples of race conditions earlier in the chapter when we introduced
synchronization.

![](identifying_threading_problems/Race-condition-on-user-creation.png)

What result does the web server return when both users attempt to create an account with the same username in Figure
13.6?

**Possible Outcomes for This Race Condition**

- Both users are able to create accounts with the username ZooFan.
- Neither user is able to create an account with the username ZooFan, and an error message is returned to both users.
- One user is able to create an account with the username ZooFan, while the other user receives an error message.

The first outcome is really bad, as it leads to users trying to log in with the same user- name. Whose data do they see
when they log in? The second outcome causes both users to have to try again, which is frustrating but at least doesn’t
lead to corrupt or bad data.

The third outcome is often considered the best solution. Like the second situation, we pre- serve data integrity; but
unlike the second situation, at least one user is able to move forward on the first request, avoiding additional race
condition scenarios.

For the exam, you should understand that race conditions lead to invalid data if they are not properly handled. Even the
solution where both participants fail to proceed is preferable to one in which invalid data is permitted to enter the
system.
