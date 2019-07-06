package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream=new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int max=0;
        int i;
        while(inputStream.available()>0)
            if((i=inputStream.read())>max)
                max=i;
        inputStream.close();
        System.out.println(max);
    }
}
