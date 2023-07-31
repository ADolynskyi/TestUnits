package org.example;

public class Calculator {
    public int sum(int n, int m) {
        return m + n;
    }

    public int dif(int n, int m) {
        return n - m;
    }

    public double div(int n, int m) {
        if (m == 0) {
            throw new IllegalArgumentException("Can`t dived by zero");
        } else {
            return (double) n / m;
        }
    }

    public long mul(long n, long m) {
        return n * m;
    }


}
