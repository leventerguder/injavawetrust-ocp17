package chapter07.questions.q01;


public record BeardedDragon(boolean fun) {
    @Override
    public boolean fun() {
        return false;
    }
}