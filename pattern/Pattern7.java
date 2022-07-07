package com.bridgelabz.pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();

        pattern7(n);
    }

    private static void pattern7(int n) {
        for (int rows = n; rows >=1; rows--){
            for (int spaces = n;spaces >rows;spaces--){
                System.out.print(" ");
            }
            for (int column = 1;column <= rows; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
