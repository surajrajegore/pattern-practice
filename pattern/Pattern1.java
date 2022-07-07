package com.bridgelabz.pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows you want print  ");
        int n = sc.nextInt();
        pattern(n);
    }
    static void pattern(int n)
    {
        for (int rows = 1; rows<=n; ++rows)
        {
            for(int column = 1; column <=n; ++column)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
