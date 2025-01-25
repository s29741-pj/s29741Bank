package com.example.s29741bank;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public TransactionStatus orderTrn (int id, float amount, Controller controller,TransactionStatus transactionStatus, AccountStorage accountStorage) {
        return controller.checkStatus(amount,controller.getAccount(id,accountStorage), transactionStatus);
    }

//    addMoney
//    getClientData


}
