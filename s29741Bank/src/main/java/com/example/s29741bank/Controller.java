package com.example.s29741bank;


import org.springframework.stereotype.Component;

@Component
public class Controller {
    public Account getAccount(int id, AccountStorage accountStorage) {
        return  accountStorage.getAccount(id);
    }
    public float checkBalance(int id, AccountStorage accountStorage) {
        return accountStorage.getAccount(id).getBalance();
    }

    public TransactionStatus checkStatus(float amount, Account account, TransactionStatus  transactionStatus) {
        transactionStatus.checkStatus(amount, account);
        return transactionStatus;
    }
//    checkIfExists

}
