package com.bridgelabz.day6logical;

public class CouponNumber {
    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int max = 100000000;
        String s = "";
        int random = (int) (Math.random() * max);
        StringBuffer sb = new StringBuffer();

        while (random>0){
            sb.append(chars[random%chars.length]);
            random/= chars.length;
        }
        String str = sb.toString();
        System.out.println(str);
    }
}
