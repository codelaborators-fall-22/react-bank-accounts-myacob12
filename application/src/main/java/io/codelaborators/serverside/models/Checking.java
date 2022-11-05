package io.codelaborators.serverside.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Checking extends Account {
    @Id
    @GeneratedValue
    private Long id;

    private String type; //personal or business for example

    @Override
    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Checking(String accountNumber, int balance, List<String> users, String type) {
        super(accountNumber, balance, users);
        this.type = type;
    }

    public Checking(){}

    @Override
    public void deposit(int amountToDeposit) {
        this.balance += amountToDeposit;
    }

    @Override
    public void withdrawal(int amountToWithdrawal) {
        this.balance -= amountToWithdrawal;
    }
}
