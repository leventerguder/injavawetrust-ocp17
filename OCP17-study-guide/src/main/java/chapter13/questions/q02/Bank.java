package chapter13.questions.q02;

import java.util.concurrent.locks.*;
import java.util.stream.*;

public class Bank {
    private Lock vault = new ReentrantLock();
    private int total = 0;

    public void deposit(int value) {
        try {
            vault.tryLock();
            total += value;
        } finally {
            vault.unlock();
        }
    }

    public static void main(String[] unused) {
        var bank = new Bank();
        IntStream.range(1, 10).parallel()
                .forEach(s -> bank.deposit(s));
        System.out.println(bank.total);
    }
}