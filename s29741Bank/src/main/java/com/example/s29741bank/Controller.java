package com.example.s29741bank;


import org.springframework.stereotype.Component;

@Component
public class Controller {
    private final AccountStorage accountStorage;
    private final TransactionStatus transactionStatus;

    public Controller( AccountStorage accountStorage, TransactionStatus transactionStatus) {
        this.accountStorage = accountStorage;
        this.transactionStatus = transactionStatus;
    }

    public Account getAccount(int id, AccountStorage accountStorage) {
        return  accountStorage.getAccount(id);
    }


    public TransactionStatus newOrder (int id, float amount) {
        transactionStatus.newOrder(id, amount);
        return transactionStatus;
    }

    public TransactionStatus addMoney (int id, float amount) {
        transactionStatus.addMoney(id, amount);
        return transactionStatus;
    }

    public float checkBalance(int id, AccountStorage accountStorage) {
        return accountStorage.getAccount(id).getBalance();
    }


}
