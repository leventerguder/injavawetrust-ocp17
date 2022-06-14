package chapter05;

public class PhysicalEducation {

    public void run1() {}

    // The run2() method doesn’t compile because it is missing the parentheses around the parameter list.
    // public void run2{} // DOES NOT COMPILE

    public void run3(int a) {}

    // The run4() method doesn’t compile because the parameters are separated by a semicolon rather than a comma.
    // public void run4(int a;int b){ } // DOES NOT COMPILE

    public void run5(int a, int b) {}
}
