package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.0, "2");
        labels.put(3.0, "4");
        labels.put(5.0, "6");
        labels.put(7.0, "8");
        labels.put(9.0, "10");
    }



    public static void main(String[] args) {



        System.out.println(labels);
    }
}
