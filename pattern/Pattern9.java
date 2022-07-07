package com.bridgelabz.pattern;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter value of rows");
        int n = sc.nextInt();
        pattern9(n);
        }
        private static void pattern9(int n){
        for (int rows = n ;rows >=1; rows--){
            {
               for (int spaces =n; spaces >rows;spaces--)
               {
                   System.out.print(" ");
               }
                for (int column = 1; column<=n*2-rows; column++)
                {
                    System.out.print("*");
                }
                System.out.println();

            }
        }


        }
}
