package chapter07.sealing_classes;

public sealed class Snake2 /* permits Snake2.Cobra */ { // permits Snake2.Cobra is OPTIONAL
    final class Cobra extends Snake2 {
    }
}