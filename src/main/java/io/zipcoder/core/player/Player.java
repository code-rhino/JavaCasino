package io.zipcoder.core.player;


import io.zipcoder.core.BankAccount;

public class Player {

    private long id;

    private String name;

    private BankAccount account;

    public Player(){

    }

    public Player(String name, BankAccount account){
        this.name = name;
        this.account = account;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

}
