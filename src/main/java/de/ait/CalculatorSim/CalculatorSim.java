package de.ait.CalculatorSim;

public class CalculatorSim {
    public int add (int a, int b){
        int first = a;
        int second = b;
        return first+second;
    }
    public int substract (int a, int b) {return a-b;}
    public int multyply (int a, int b) {return a*b;}
    public double divide (int a, int b ) {
        if (b==0){
            System.out.println(
                    "Деление на ноль!"
            );
            return -1;
        }
        else
            return (double) a/b;
    }
}
