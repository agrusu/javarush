package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100,0.95));
        System.out.println(convertEurToUsd(200,0.97));
        //напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
        double rez = eur * course;
        return rez;
        //напишите тут ваш код
    }
}
