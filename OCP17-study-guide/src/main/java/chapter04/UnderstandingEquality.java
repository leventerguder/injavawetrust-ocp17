package chapter04;

public class UnderstandingEquality {

    public static void main(String[] args) {

        /*
        The one and two variables are both completely separate StringBuilder objects, giving us two objects.
        The one and three both point to same object.
         */
        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true
        System.out.println(one.equals(two)); //false
        // the authors of StringBuilder did not implement equals()
    }
}
