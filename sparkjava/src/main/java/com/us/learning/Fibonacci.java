package com.us.learning;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Application started for Fibonacci Series calculation");
        int i = 5;
        int val = fibonacci(i);
        System.out.println(val);

    }


    public static int fibonacci(int n) {
        int sum=0;
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);

    }

}
