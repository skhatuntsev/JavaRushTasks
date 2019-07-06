package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;



        //тут цикл по чтению ключей, пункт 1
        while (true) {
            key = reader.readLine();
            if (key.equals("soapOpera")) {
                System.out.println(MovieFactory.getMovie("soapOpera").getClass().getSimpleName());
            } else if (key.equals("cartoon")) {
                System.out.println((MovieFactory.getMovie("cartoon").getClass().getSimpleName()));
            } else if (key.equals("thriller")) {
                System.out.println((MovieFactory.getMovie("thriller").getClass().getSimpleName()));
                        } else {

                break;

            }


        }
        MovieFactory.getMovie(key);






    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            else if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {

    }
    static class Cartoon extends Movie {

    }
    static class Thriller extends Movie {

    }



    //Напишите тут ваши классы, пункт 3
}
