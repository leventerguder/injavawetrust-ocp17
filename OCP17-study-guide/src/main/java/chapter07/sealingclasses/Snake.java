package chapter07.sealingclasses;

public sealed class Snake /*permits Cobra*/ { // permits Cobra is OPTIONAL
}


// In this case, the permits clause is optional and can be omitted.
// The extends keyword is still required in the subclass,though:

final class Cobra extends Snake {
}