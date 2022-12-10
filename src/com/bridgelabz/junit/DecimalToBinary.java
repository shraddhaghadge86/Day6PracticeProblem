package com.bridgelabz.junit;

import java.util.Scanner;

public class DecimalToBinary {
    static void decToBinary(int n)
    {

       int[] binaryNum = new int[1000];
        int rem;
        int i = 0;
        while (n > 0)
        {
         binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

       for (int j = i - 1; j >= 0; j--)
          System.out.print(binaryNum[j]);
    }

    public static void main (String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any number: ");

        int n = s1.nextInt();
        System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
        decToBinary(n);
    }

}
