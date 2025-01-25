package com.example.s29741bank;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final Controller controller;
    private final AccountStorage accountStorage;
    private final TransactionStatus transactionStatus;

    public AccountService(Controller controller, AccountStorage accountStorage, TransactionStatus transactionStatus) {
        this.controller = controller;
        this.accountStorage = accountStorage;
        this.transactionStatus = transactionStatus;
    }

    // order transaction
    public TransactionStatus orderTrn (int id, float amount) {
        return controller.newOrder(id, amount);
    }

//    addMoney
    public TransactionStatus addMoney (int id, float amount) {
        return controller.addMoney(id, amount);
    }

//    getClientData
    public void printClientData(int id){
        System.out.println("Client number: " + controller.getAccount(id, accountStorage).getAccountId() + " account balance: " + controller.getAccount(id, accountStorage).getBalance());
    }


}
