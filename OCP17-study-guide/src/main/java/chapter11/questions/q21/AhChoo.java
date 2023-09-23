package chapter11.questions.q21;

public class AhChoo {
    static class SneezeException extends Exception {
    }

    static class SniffleException extends SneezeException {
    }

//    public static void main(String[] args) {
//        try {
//            throw new SneezeException();
//        } catch (SneezeException | SniffleException e) {
//
//        } finally {
//        }
//    }

    public static void mainV2(String[] args) {
        try {
            throw new SneezeException();
        } catch (SneezeException e) {

        } finally {
        }
    }
}
