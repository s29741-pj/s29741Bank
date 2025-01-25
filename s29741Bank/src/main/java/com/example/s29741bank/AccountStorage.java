package com.example.s29741bank;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountStorage {
    private List<Account> accounts = new ArrayList<Account>();

    public AccountStorage() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public Account getAccount(int id) {
        for (Account account : accounts) {
            if (account.getAccountId() == id){
                return account;
            }
        }
        return null;
    }


    public List<Account> getAccounts() {
        return accounts;
    }

}
