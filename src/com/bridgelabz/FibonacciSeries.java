package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    static int n1 = 0,n2 =1,n3=0;

    static void printFibonacci(int c){
        for (int i=2; i<=c;i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
        }
    }

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the total number you want to print: ");
        int c = s1.nextInt();
        System.out.print(n1+ " "+n2);
        printFibonacci(c-2);
    }
}
