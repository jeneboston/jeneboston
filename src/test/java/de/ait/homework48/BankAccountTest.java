package de.ait.homework48;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void depositShouldIncreaseBalance() {
        // Arrange
        BankAccount account = new BankAccount("123456", "John Doe", 100.0);

        // Act
        account.deposit(50.0);

        // Assert
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    void depositWithNegativeAmountShouldNotChangeBalance() {
        // Arrange
        BankAccount account = new BankAccount("123456", "John Doe", 100.0);

        // Act
        account.deposit(-50.0);

        // Assert
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    void withdrawShouldDecreaseBalance() {
        // Arrange
        BankAccount account = new BankAccount("123456", "John Doe", 100.0);

        // Act
        account.withdraw(50.0);

        // Assert
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    void withdrawWithInsufficientFundsShouldThrowException() {
        // Arrange
        BankAccount account = new BankAccount("123456", "John Doe", 50.0);

        // Act and Assert
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(100.0));
    }

    @Test
    void withdrawWithNegativeAmountShouldNotChangeBalance() {
        // Arrange
        BankAccount account = new BankAccount("123456", "John Doe", 100.0);

        // Act
        account.withdraw(-50.0);

        // Assert
        assertEquals(100.0, account.getBalance(), 0.001);
    }


}