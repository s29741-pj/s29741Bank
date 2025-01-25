package com.example.s29741bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class accountServiceTest {

    private AccountService accountService;
    private AccountStorage  accountStorage;
    private Controller controller;
    private TransactionStatus transactionStatus;



    @BeforeEach
    public void setUp() {
        accountService = new AccountService(controller,accountStorage,transactionStatus);
        accountStorage = new AccountStorage();
        controller = new Controller(accountStorage,transactionStatus);
        transactionStatus = new TransactionStatus(accountStorage);
        Account account_1 = new Account(1,1000.0f);
        Account account_2 = new Account(2,2000.0f);
        accountStorage.addAccount(account_1);
    }

    @Test
    public void testOrderTrn() {
        accountService.orderTrn(1, 500.0f);
        assertTrue( accountService.orderTrn(1, 500.0f).getStatus().equals("Transaction is completed"));
    }

}
