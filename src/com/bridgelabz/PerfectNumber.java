package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

    public static void findPerfect(int num, int sum) {
        for(int i = 1; i<=num/2; i++) {
            if (num % i == 0) {
                sum = sum + i;
                System.out.print(i+" ");
            }

        }
        System.out.println("\nTotal Sum: "+sum);
            if(num==sum){
                System.out.println("\nThe Number "+num+" is perfect number");
            }else {
                System.out.println("\nThe Number "+num+" is not a perfect number");
            }

    }

    public static void main(String[] args) {
        int sum = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num = s1.nextInt();
        findPerfect(num,sum);
    }
}
