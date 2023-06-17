package chapter07.implementing_interfaces;

public class ZooRenovationImpl implements ZooRenovation {
    @Override
    public String projectName() {
        return "Zoo";
    }

    @Override
    public String status() {
        return "OPEN";
    }

    public static void main(String[] args) {

        ZooRenovation z = new ZooRenovationImpl();
        z.printStatus();
    }
}
