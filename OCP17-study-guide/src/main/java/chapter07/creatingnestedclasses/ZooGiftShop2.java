package chapter07.creatingnestedclasses;

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
