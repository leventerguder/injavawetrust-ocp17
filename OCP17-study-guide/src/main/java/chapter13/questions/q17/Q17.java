package chapter13.questions.q17;

public class Q17 {

// Which statements about methods in ReentrantLock are correct? (Choose all that apply.)

//    A. The lock() method will attempt to acquire a lock without waiting indefinitely for it.
//    B. The testLock() method will attempt to acquire a lock without waiting indefinitely for it.
//    C. The attemptLock() method will attempt to acquire a lock without waiting indefinitely for it.
//    D. By default, a ReentrantLock fairly releases to each thread in the order in which it was requested.
//    E. Calling the unlock() method once will release a resource so that other threads can
//    obtain the lock.
//    F. None of the above

// The lock() method will wait indefinitely for a lock.
// A fairness is set to false by default and must be enabled by using an overloaded constructor.
// option E is incorrect because a thread that holds the lock may have called lock() or tryLock() multiple times.
}
