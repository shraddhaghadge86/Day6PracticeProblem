package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean findPrime(int num,int count) {

        for(int i = 2; i<=num;i++) {
            if (num % i == 0) {
             count++;
             }
        }
        if (count== 1) {
           return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner s1= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = s1.nextInt();
        int count = 0;
        boolean result = findPrime(num,count);
        if(result){
            System.out.println(num+ " is a prime number");
        }else {
            System.out.println(num+ " is not a prime number");
        }
        }
}

