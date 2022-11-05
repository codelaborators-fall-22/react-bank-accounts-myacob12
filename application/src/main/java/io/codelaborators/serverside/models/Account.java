package io.codelaborators.serverside.models;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

//We are CONTRACTING our software, that IF you want to make an account, it
//must contain data for acctNum, balance, users and the ability to
//deposit and withdrawal

@Entity
public abstract class Account {

    @GeneratedValue
    @Id
    private Long id;

    private String accountNumber;
    protected int balance;
    @ElementCollection
    private List<String> users;

    public Long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public List<String> getUsers() {
        return users;
    }

    public Account(String accountNumber, int balance, List<String> users) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.users = users;
    }

    //JPA requires the empty constructor
    public Account(){}

    public abstract void deposit(int amountToDeposit);

    public abstract void withdrawal(int amountToWithdrawal);

}
