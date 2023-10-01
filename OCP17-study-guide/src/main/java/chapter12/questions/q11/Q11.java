package chapter12.questions.q11;

public class Q11 {

    // Suppose module puppy depends on module dog and module dog depends on module animal.
    // Which lines allow module puppy to access the animal.behavior package in module animal?
    // (Choose all that apply.)

//    module animal {
//        exports animal.behavior;
//    }
//
//    module dog {
//        animal; // line S
//    }
//    module puppy {
//        dog; // line T
//    }


//    D. requires on line T
//    G. requires transitive on line S
//    H. requires transitive on line T
}
