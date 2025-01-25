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
        accounts.add(account);
    }

    public void addAccount(int id, float amount) {
        Account account = new Account(id, amount);
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


    public boolean checkIfExists(int id){
        for(Account a : accounts){
            if(a.getAccountId() == (id)) {
                return true;
            }
        }
        return false;
    };

    public List<Account> getAccounts() {
        return accounts;
    }

}
