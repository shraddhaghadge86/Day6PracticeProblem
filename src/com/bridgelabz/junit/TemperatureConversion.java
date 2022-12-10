package com.bridgelabz.junit;
/*program to the take temperature
*in fahrenheit as input
*outputs the temperature in Celsius
* or vice versa
 */

import java.util.Scanner;

public class TemperatureConversion {

    static double f,c;
    static Scanner s1 = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Choose conversion Type:\n1. Fahrenheit to Celsius\n 2.Celsius to Fahrenheit");
        int ch = s1.nextInt();
        temperatureConversion(ch);

    }

    static void temperatureConversion(int ch){
        switch (ch){
            case 1:
                System.out.println("Enter temperature in Fahrenheit: ");
                f = s1.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("Celsius Temperature is: "+c);
                break;
            case 2:
                System.out.println("Enter temperature in Celsius: ");
                c = s1.nextDouble();
                f = (c * 9 / 5) + 32;
                System.out.println("Fahrenheit Temperature is: "+f);
            break;
            default:
                System.out.println("Please select valid choice");
        }
    }

}
