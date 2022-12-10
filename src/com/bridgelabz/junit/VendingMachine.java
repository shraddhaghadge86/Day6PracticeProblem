package com.bridgelabz.junit;

import java.util.Scanner;

public class VendingMachine {

    public static void noteCount(int amount) {

        int[] notes = new int[]{1000, 500,200, 100, 50, 20, 10, 5, 1};
        int[] count = new int[9];

        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                count[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
        System.out.println("Currency Count: ");
        for (int i = 0; i < 9; i++) {
            if (count[i] != 0) {
                System.out.println(notes[i] + " : " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = s1.nextInt();
        noteCount(amount);
    }
}
