package chapter01.initializing_variables;

public class UninitializedLocalVariables {
    /*
    Local variables do not have a default value and must be initialized before use.
    Furthermore, the compiler will report an error if you try to read an uninitialized value.
     */

    public void notValid() {
        int y = 10;
        int x;
        //   int reply = x + y; // DOES NOT COMPILE
    }

    public int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // x is initialized here
        int z; // z is declared here but never initialized or used

        int reply = x + y;
        return reply;
    }

    /*
    The compiler is also smart enough to recognize initializations that are more complex. In this example, there are two branches of code
     */
    public void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        // System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }


    public int validV2() {
        int y;
        int x;
        return 0;
    }

    public int notValidV2() {

        int x;
        int y;

        // System.out.println(y);

        return 0;
    }
}

