package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = s1.nextInt();
        int reverse = findReverse(num);
        System.out.println("The reverse of "+num+ " is: "+reverse);
    }

    private static int findReverse(int num) {
        int rev = 0;
        while(num>0){
            int rem = num%10;
            rev = (rev * 10) + rem;
            num = num/10;
        }
        return rev;
    }
}
