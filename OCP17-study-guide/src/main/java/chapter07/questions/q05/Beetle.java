//package chapter07.questions.q05;
//
//interface HasExoskeleton {
//    double size = 2.0f;
//
//    abstract int getNumberOfSections();
//}
//
//abstract class Insect implements HasExoskeleton {
//    abstract int getNumberOfLegs();
//}
//
//public class Beetle extends Insect { // DOES NOT COMPILE
//
//    int getNumberOfLegs() { return 6; }
//
//    int getNumberOfSections(int count) { return 1; } // Overloaded!
//}
