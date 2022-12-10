package com.bridgelabz.junit;

import java.util.Scanner;

public class DayOfWeek {
    static String day;

    static String dayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        
        switch (d0) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            default:
                day = "Saturday";
                break;
        }
    return day;
    }

    public static void main(String[] args) {

        int d, m, y;
        Scanner s = new Scanner(System.in);
        System.out.println("enter date in day month year");
        d = s.nextInt();
        m = s.nextInt();
        y = s.nextInt();
        System.out.println("day is " +dayOfWeek(d,m,y));

    }

}
