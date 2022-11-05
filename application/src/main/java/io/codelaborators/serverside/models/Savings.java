package io.codelaborators.serverside.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Savings extends Account {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public Savings(String accountNumber, int balance, List<String> users) {
        super(accountNumber, balance, users);
    }

    public Savings() {
    }

    @Override
    public void deposit(int amountToDeposit) {
        this.balance += amountToDeposit;
    }

    @Override
    public void withdrawal(int amountToWithdrawal) {
        this.balance -= amountToWithdrawal;
    }
}
