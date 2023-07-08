package chapter03.creating_decision_making_statements.patternmatching;

public class PatternMatching3 {

    public static void main(String[] args) {

        Point point = new Point(100);

        afterPatternMatching(point);


    }


    private static void afterPatternMatching(Object obj) {

        var pointX = obj instanceof Point p ? p.x : 0;
        System.out.println(pointX);

    }
}

class Point {

    int x;

    public Point(int x) {
        this.x = x;
    }
}