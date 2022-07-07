package com.bridgelabz.pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want to print  ");

        int n = sc.nextInt();

        pattern4(n);
    }

     static void pattern4(int n) {
        for (int rows = 1; rows <= n; rows++)
        {
            for (int column = 1; column <= rows; column++){
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
