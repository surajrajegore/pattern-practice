package com.bridgelabz.pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of you want to print ");
        int n = sc.nextInt();
        pattern2(n);
    }
    static void pattern2(int n)
    {
        for (int rows = 1; rows <= n; rows++)//this is for number of rows
        {
            for(int columns = 1;columns <= rows; columns++) //this is for column
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
