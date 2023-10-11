package de.ait.homework35;

public class CalculatorSim {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0.) {
            return -1;  // Результат деления на ноль
        } else {
            return a / b;
        }
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}