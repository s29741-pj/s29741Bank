package com.example.s29741bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S29741BankApplication {

    private final Account account;
    private final AccountStorage accountStorage;
    private final AccountService accountService;
    private final Controller controller;
    private final TransactionStatus transactionStatus;

    public S29741BankApplication(Account account, AccountStorage accountStorage, AccountService accountService, Controller controller, TransactionStatus transactionStatus) {
        this.account = account;
        this.accountStorage = accountStorage;
        this.accountService = accountService;
        this.controller = controller;
        this.transactionStatus = transactionStatus;
    }

public void run(){

}



    public static void main(String[] args) {
        SpringApplication.run(S29741BankApplication.class, args);
    }

}
