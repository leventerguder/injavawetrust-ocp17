package chapter07.questions.q01;

public record Newt(long size) {

    @Override
    public boolean equals(Object obj) {
        return false;
    }

//    public void setSize(long size) {
//        this.size = size; // DOES NOT COMPILE
//    }
}
