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

    public int getAccountId() {
        return accountId;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }
}
