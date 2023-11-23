package de.ait.homework48;

public class InsufficientFundsException extends RuntimeException{
    public InsufficientFundsException(String message, double balance, double amount) {
        super(message + " Balance: " + balance + " Amount: " + amount);
    }
}
