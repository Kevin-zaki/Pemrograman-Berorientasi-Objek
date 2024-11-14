package com.atm.model;

public class Account {
    private String accountNumber;
    private String pin;
    private double balance;
    public static final double MINIMUM_BALANCE = 50000; // Minimum balance constant

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getter dan Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }
    
    public boolean withdraw(double amount) {
        if (balance - amount < MINIMUM_BALANCE) {
            System.out.println("Penarikan gagal. Saldo minimal Rp" + MINIMUM_BALANCE + " harus tetap ada.");
            return false;
        }
        balance -= amount;
        System.out.println("Penarikan sebesar Rp" + amount + " berhasil. Saldo sekarang: Rp" + balance);
        return true;
    }

    public void changePin(String oldPin, String newPin1, String newPin2) {
        if (!this.pin.equals(oldPin)) {
            System.out.println("PIN lama tidak valid.");
            return;
        }

        if (!newPin1.equals(newPin2)) {
            System.out.println("PIN baru tidak cocok.");
            return;
        }

        this.pin = newPin1; // Update the PIN
        System.out.println("PIN berhasil diubah.");
    }
}
