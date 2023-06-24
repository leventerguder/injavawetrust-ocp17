package chapter01.questions.q08;

public class Q08 {

    public static void main(String[] args) {

        //var spring = null;  // DOES NOT COMPILE

        // A var cannot be initialized with a null value without a type ,
        // but it can be assigned a null value later
        // if the underlying type is not a primitive.

        var fall = "leaves";
        var evening = 2;
        // evening = null;  // DOES NOT COMPILE
        var night = Integer.valueOf(3);
        var day = 1 / 0;

        // var winter = 12, cold; // DOES NOT COMPILE
        // var fall = 2, autumn = 2; // DOES NOT COMPILE
        // var can not be used in a multiple-variable assignment.

        var morning = "";
        morning = null;
    }
}
