package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Calculator calc = new Calculator();
        System.out.println("calc.sum(12+224) = " + calc.sum(12,224));
        System.out.println("calc.dif(136-86) = " + calc.dif(136,86));
        System.out.println("calc.div(13/4) = " + calc.div(13,4));
        System.out.println("calc.mul(13*4) = " + calc.mul(13,4));
        System.out.println("calc.mul(222222*8888888) = " + calc.mul(2222222,8888888));

    }
}