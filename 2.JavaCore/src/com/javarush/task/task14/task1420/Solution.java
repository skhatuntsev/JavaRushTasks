package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        if (a<=0) {throw new IllegalArgumentException("Only positive numbers allowed");}

        int b = Integer.parseInt(in.nextLine());
        if (b<=0) {throw new IllegalArgumentException("Only positive numbers allowed");}
        gcdThing(a, b);


        }
    private static void gcdThing(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        System.out.println((gcd.intValue()));
    }
}
