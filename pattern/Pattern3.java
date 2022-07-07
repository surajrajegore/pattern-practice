package com.bridgelabz.pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        pattern3(n);
    }
    static void pattern3(int n){
        for (int rows = 1; rows <=n; rows++){
            for(int column = 1; column<=n-rows+1; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
