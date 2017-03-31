package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        boolean bool;
        Date date1 = new Date(date);
        Date ms = new Date(date);
        ms.setHours(0);
        ms.setMinutes(0);
        ms.setSeconds(0);
        ms.setMonth(0);
        ms.setDate(1);
        long num = date1.getTime()-ms.getTime();
        long dayMs = 24 * 60 * 60 * 1000;
        int day = (int) (num/dayMs);
        bool = day % 2 == 0;
        return bool;
    }
}
