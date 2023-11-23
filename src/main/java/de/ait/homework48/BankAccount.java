package de.ait.homework48;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(de.ait.homework48.BankAccount.class);

    private String number;
    private String ownerName;
    private double balance;

    public BankAccount(String number, String ownerName, double balance) {
        this.number = number;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            LOGGER.error("Deposit amount must be greater than zero");
            return;
        }
        balance += amount;
        LOGGER.info("Account owner {} deposited {} euros Now balance is {}", ownerName, amount, balance);
    }

    public void withdraw(double amount) {
        try {
            if (amount <= 0) {
                LOGGER.error("Withdrawal amount must be greater than zero");
                return;
            }

            if (amount > balance) {
                LOGGER.error("Owner {} has insufficient balance: {} euros", ownerName, balance);
                throw new InsufficientFundsException("Withdrawal not possible", balance, amount);
            }

            balance -= amount;
            LOGGER.info("Owner {} withdraw {} euros", ownerName, amount);
        } catch (InsufficientFundsException exception) {
            LOGGER.error("Error during withdrawal: {}", exception.getMessage());
        }
    }
    public double checkBalance(){
        LOGGER.debug("Checking balance {}", ownerName);
        return balance;
    }
}