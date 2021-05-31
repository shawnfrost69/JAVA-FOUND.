package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fibn = fib(n);
        System.out.println(fibn);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibm1 = fib(n - 1);
        int fibm2 = fib(n - 2);
        int fib = fibm1 + fibm2;

        return fib;

    }
}
