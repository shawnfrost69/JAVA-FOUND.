package com.company;
import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cp = countpaths(n);
        System.out.println(cp);
    }

 //   RECURSION
//    public static int countpaths(int n){
//        if(n == 0){
//            return 1;
//        }
//         else if(n < 0){
//            return 0;
//        }
//        System.out.println("Hello" +n);
//         int nm1 = countpaths(n-1);
//         int nm2 = countpaths(n-2);
//         int nm3 = countpaths(n-3);
//         int cp = nm1 +nm2 +nm3;
//
//         return cp;
//    }
//
//    //  MEMOIZATION
//    public static int countpaths(int n, int[] qb){
//        if(n == 0){
//            return 1;
//        }
//        else if(n < 0){
//            return 0;
//        }
//        if (qb[n]> 0){
//            return qb[n];
//        }
//        System.out.println("Hello" +n);
//        int nm1 = countpaths(n-1, qb);
//        int nm2 = countpaths(n-2, qb);
//        int nm3 = countpaths(n-3, qb);
//        int cp = nm1 +nm2 +nm3;
//
//        qb[n] = cp;
//        return cp;

    //  TABULATION
    public static int countpaths(int n){
        int[] dp = new int [ n + 1];

        dp[0]=1;
        for (int i =1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }return dp[n];
    }
}
