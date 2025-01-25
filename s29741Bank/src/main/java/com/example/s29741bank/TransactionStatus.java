package com.example.s29741bank;

import org.springframework.stereotype.Component;

@Component
public class TransactionStatus {
    private float balanceUpdate;
    private String status;

    private final AccountStorage accountStorage;

    public TransactionStatus( AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }

    public void newOrder (int id, float amount) {
        if(accountStorage.getAccount(id).getBalance() <= 0) {
            setStatus("Account balance is less than zero");
        }else if(!accountStorage.checkIfExists(id)){
            setStatus("Account does not exist");
        }
        else {
            balanceUpdate = accountStorage.getAccount(id).getBalance() - amount;
            accountStorage.getAccount(id).setBalance(balanceUpdate);
            setStatus("Transaction is completed");
        }
    };

    public void addMoney (int id, float amount) {
        if(!accountStorage.checkIfExists(id)){
            setStatus("Account does not exist");
        }else{
            accountStorage.getAccount(id).updateBalance(amount);
            setStatus("Amount " + amount + "$ added to account");
        }
    }

    public float getBalanceUpdate() {
        return balanceUpdate;
    }

    public String getStatus() {
        return status;
    }

    private void setStatus(String update) {
        this.status = update;
    }
}
