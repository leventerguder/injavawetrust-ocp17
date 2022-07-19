package chapter09.comparingcollectiontypes;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        // Stack is no longer on the exam.
        Stack<String> stack = new Stack<>();

        stack.push("e1");
        stack.push("e2");
        stack.push("e3");
        stack.push("e4");

        System.out.println(stack.pop()); // e4
        System.out.println(stack.pop()); // e3
        System.out.println(stack.pop()); // e2
        System.out.println(stack.pop()); // e1
        System.out.println(stack.pop()); // java.util.EmptyStackException
    }
}
