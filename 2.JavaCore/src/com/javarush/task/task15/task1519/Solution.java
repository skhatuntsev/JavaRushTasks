package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit"))
                break;
            try {
                int integer = Integer.parseInt(s);
                if (integer >= 128 || integer <= 0) {
                    print(integer);
                } else {
                    short shortNumber = (short) integer;
                    print(shortNumber);
                }
                //continue;
            } catch (Exception e) {
                try {
                    double doubleNum = Double.parseDouble(s);
                    print(doubleNum);
                    //continue;
                } catch (Exception ee) {
                    print(s);
                }
            }
        }


    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
