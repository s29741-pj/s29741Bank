package com.example.s29741bank;

import org.springframework.stereotype.Component;

@Component
public class TransactionStatus {
    private float balanceUpdate;
    private boolean status;

    public void checkStatus(float amount ,Account account) {
        if(account.getBalance() <= 0) {
            setStatus(false);
        }else {
            balanceUpdate = account.getBalance() - amount;
            account.setBalance(balanceUpdate);
            setStatus(true);
        }
    };

    public float getBalanceUpdate() {
        return balanceUpdate;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
}
