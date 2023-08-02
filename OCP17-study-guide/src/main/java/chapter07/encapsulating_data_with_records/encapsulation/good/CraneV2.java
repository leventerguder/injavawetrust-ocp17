package chapter07.encapsulating_data_with_records.encapsulation.good;

public class CraneV2 {
    private int numberEggs;
    private String name;

    public CraneV2(int numberEggs, String name) {

        validateNumberEggs(numberEggs);

        this.numberEggs = numberEggs; // guard condition
        this.name = name;
    }

    private void validateNumberEggs(int numberEggs) {
        if (numberEggs < 0)
            throw new IllegalArgumentException();
    }

    public int getNumberEggs() {
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs) {
        validateNumberEggs(numberEggs);
        this.numberEggs = numberEggs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}