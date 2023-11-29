package de.ait.Exceptions;

public class Exceptions {
    public static void main(String[] args) {
        divide(10,5);
    }
    public static void divide (int numberOne, int numberTwo){
        int result = numberOne/numberTwo;
        System.out.println(result);
    }
}
