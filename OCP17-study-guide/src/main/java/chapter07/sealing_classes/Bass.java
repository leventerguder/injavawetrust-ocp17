package chapter07.sealing_classes;

public final class Bass extends Fish{

    private String bassName;

    public Bass(String bassName) {
        this.bassName = bassName;
    }

    public String getBassName() {
        return bassName;
    }
}
