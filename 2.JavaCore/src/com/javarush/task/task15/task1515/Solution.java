package com.javarush.task.task15.task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Статики-2
*/

public class Solution {
    public static int A;
    public static int B;


    static {

            try {
                InputStreamReader is = new InputStreamReader(System.in);
                BufferedReader reader = new BufferedReader(is);
                A = Integer.parseInt(reader.readLine());
                B = Integer.parseInt(reader.readLine());
                is.close();
                reader.close();
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    public static final int MIN = min(A, B);


    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
