package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(3, 2);
        int b = calc.minus.apply(2, 1);
        int c = calc.divide.apply(a,b);
        calc.println.accept(c);

    }
}
