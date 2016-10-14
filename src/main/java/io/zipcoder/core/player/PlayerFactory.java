package io.zipcoder.core.player;

import io.zipcoder.core.BankAccount;
import io.zipcoder.core.Display;

public class PlayerFactory {

    public static Player createNewPlayer(){
        String username = Display.promptUserForString("Enter User name");
        Double amount = Display.promptUserForDouble("Please enter amount of money");
        BankAccount bankAccount = new BankAccount(amount);
        return new Player(username, bankAccount);
    }
}
