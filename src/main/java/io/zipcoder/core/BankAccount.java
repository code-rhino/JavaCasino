package io.zipcoder.core;

/**
 * Created by thook on 10/12/16.
 */
public class BankAccount {
    private Double money;

    public BankAccount(Double amount){
        this.money = amount;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
