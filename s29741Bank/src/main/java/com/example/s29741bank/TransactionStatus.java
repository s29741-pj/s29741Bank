package com.example.s29741bank;

import org.springframework.stereotype.Component;

@Component
public class TransactionStatus {
    private float balanceUpdate;
    private boolean status;

    private final AccountStorage accountStorage;

    public TransactionStatus( AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }

    public void newOrder (int id, float amount) {
        if(accountStorage.getAccount(id).getBalance() <= 0) {
            setStatus(false);
        }else {
            balanceUpdate = accountStorage.getAccount(id).getBalance() - amount;
            accountStorage.getAccount(id).setBalance(balanceUpdate);
            setStatus(true);
        }
    };

    public void addMoney (int id, float amount) {
        accountStorage.getAccount(id).updateBalance(amount);
    }

    public float getBalanceUpdate() {
        return balanceUpdate;
    }

    public boolean getStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }
}
