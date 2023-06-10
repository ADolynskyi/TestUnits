package org.example;

public class SumCalculator {
    public int sum(int n){
        if (n==0){
            throw new IllegalArgumentException("Input shouldn't be zero");
        }
        int result=0;
        for (int i = 1; i <= n; i++) {
            result+=i;
        }
        return result;
    }
}
