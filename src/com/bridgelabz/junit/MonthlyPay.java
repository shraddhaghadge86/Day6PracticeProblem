package com.bridgelabz.junit;

import java.util.Scanner;

public class MonthlyPay {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        double p = s1.nextDouble();
        System.out.println("Enter Rate of Interest: ");
        double rate = s1.nextDouble();
        rate = rate / (12*100);
        System.out.println("Enter Time period in Years: ");
        double n = s1.nextDouble();
        n = 12 * n;

        double pay = monthlyPayment(p, rate, n);
        System.out.println("Monthly Payment: " +pay);

    }

    static double monthlyPayment(double p,double rate, double n){
        double m = (p * rate)/(1- Math.pow((1 + rate), (-n)));
        return m;
    }
}
