package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream inputStream=new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        Integer min = Integer.MAX_VALUE;
        int i;
        while(inputStream.available()>0)
            if((i=inputStream.read())<min)
                min=i;
        inputStream.close();
        System.out.println(min);
    }
}
