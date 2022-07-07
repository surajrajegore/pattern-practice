package com.bridgelabz.pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want to print ");
        int n = sc.nextInt();

        pattern6(n);
    }

    private static void pattern6(int n) {
        for (int rows = 1; rows <= n; rows++){
            for (int spaces = n-1; spaces >= rows; spaces--){
                System.out.print(" ");
            }
            for (int columns = 1;columns <= rows; columns++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
