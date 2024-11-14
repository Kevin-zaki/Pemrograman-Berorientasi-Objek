package com.atm.transaction;

import com.atm.model.Account;
import java.util.Scanner;

public class Withdrawal extends Transaction {
    private Account account;

    public Withdrawal(Account account) {
        super(account); // Call to the superclass constructor
        this.account = account; // Initialize the account variable
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah penarikan: ");
        double amount = scanner.nextDouble();

        // Attempt to withdraw using the account's withdraw method
        if (!account.withdraw(amount)) {
            System.out.println("Penarikan gagal. Saldo tidak cukup.");
        } else {
            System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + account.getBalance());
        }
    }
}