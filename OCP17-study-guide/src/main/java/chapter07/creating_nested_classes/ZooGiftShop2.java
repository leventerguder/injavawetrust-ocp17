package chapter07.creating_nested_classes;

public class ZooGiftShop2 {

    interface SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() {
                return 3;
            }
        }; // Don't forget the semicolon! r
        return basePrice - sale.dollarsOff();
    }
}
