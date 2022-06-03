package chapter03;

public class SwitchStatementAcceptableCaseValues {

    final int getCookies() {
        return 4;
    }

    void feedAnimals() {

        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();

        switch (numberOfAnimals) {
            case bananas:
                // case apples: // DOES NOT COMPILE
                // case getCookies(): // DOES NOT COMPILE
                // case cookies: // DOES NOT COMPILE
            case 3 * 5:
        }
    }
    /*
    The bananas variable is marked final, and its value is known at compile-time, so it is valid.
    The apples variable is not marked final, even though its value is known, so it is not permitted
     */

    // The next two case statements, with values getCookies() and cookies,
    // do not compile because methods are not evaluated until runtime, so they cannot be used as the value of a case statement,
    // even if one of the values is stored in a final variable.
    // The last case statement, with value 3 * 5, does compile, as expressions are allowed as case values,
    // provided the value can be resolved at compile-time.

}
