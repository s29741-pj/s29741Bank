package com.example.s29741bank;

public class Account {
    private int accountId;
    private float balance;

    public Account(int accountId, float balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public int getAccountId() {
        return accountId;
    }

    public float getBalance() {
        return balance;
    }

    public void updateBalance(float amount) {
        this.balance += amount;
    }
}
