package chapter14.serializing_data.understanding_the_deserialization_creation_process;

public class BabyChimpanzee extends Chimpanzee {

    private static final long serialVersionUID = 3L;
    private String mother = "Mom";

    public BabyChimpanzee() {
        super();
    }

    public BabyChimpanzee(String name, char type) {
        super(name, 0, type);
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "BabyChimpanzee{" +
                "mother='" + mother + '\'' +
                '}';
    }
}
