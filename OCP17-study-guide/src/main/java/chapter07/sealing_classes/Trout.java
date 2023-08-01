package chapter07.sealing_classes;

public final class Trout extends Fish {

    private String troutName;

    public Trout(String troutName) {
        this.troutName = troutName;
    }

    public String getTroutName() {
        return troutName;
    }

    public void setTroutName(String troutName) {
        this.troutName = troutName;
    }
}
