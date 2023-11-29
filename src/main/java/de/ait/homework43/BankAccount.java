package de.ait.homework43;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;

    }
    public void deposit (double amount){
        if (amount<=0){
            LOGGER.error("Balance incorrect");
        }
        balance = balance+amount;
        LOGGER.info("Account owners {} deposited {} euro(-s)4", owner, amount);
    }

    public  void withdraw (double amount){

        if (amount > balance){
            LOGGER.error("Owner {} balance {} euro (-s)",owner, balance);
        }else {
            balance = balance-amount;
            LOGGER.info("Owner {} withdraw {} euro(-s)",owner,amount);
        }
        if (amount<=0){
            LOGGER.error("Amount {} incorrect",amount);
        }
    }

    public double checkBalance(){
        LOGGER.debug("Checking balance {}", owner);
        return balance;
    }
}
