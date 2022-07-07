package com.bridgelabz.pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want to print ");
        int n = sc.nextInt();
        pattern8(n);
    }
    private static void pattern8(int n){
        int k=0;
        for(int rows = 1; rows <= n; ++rows,k=0){
            for (int spaces=1 ; spaces <= n-rows; ++spaces){
                System.out.print(" ");
            }
            while(k!=2*rows-1){
                System.out.print(" * ");
                ++k;
            }
            System.out.println();


        }
    }

}
