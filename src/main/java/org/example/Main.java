package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SumCalculator calc = new SumCalculator();
        System.out.println("calc.sum(12) = " + calc.sum(12));
    }
}