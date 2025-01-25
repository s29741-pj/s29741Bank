package com.example.s29741bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S29741BankApplication {

    private final AccountStorage accountStorage;
    private final AccountService accountService;
    private final Controller controller;
    private final TransactionStatus transactionStatus;

    public S29741BankApplication(AccountStorage accountStorage, AccountService accountService, Controller controller, TransactionStatus transactionStatus) {
        this.accountStorage = accountStorage;
        this.accountService = accountService;
        this.controller = controller;
        this.transactionStatus = transactionStatus;
        run();
    }

public void run(){
        Account account_1 = new Account(1,1000.0f);
        accountStorage.addAccount(account_1);
        System.out.println(account_1.getAccountId());
        System.out.println(account_1.getBalance());
}

    public static void main(String[] args) {
        SpringApplication.run(S29741BankApplication.class, args);
        System.exit(0);
    }

}
