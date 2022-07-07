package com.bridgelabz.pattern;

import java.util.Scanner;

class Pattern5{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n for rows ");
        int n = sc.nextInt();
        pattern5(n);
    }
    static void pattern5(int n){

        for (int rows = 1; rows <= n; rows++) {
            for (int column=1 ; column <=rows; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int rows = 1;rows <= n-1; rows++){
            for (int column = n-1; column >= rows; column--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}