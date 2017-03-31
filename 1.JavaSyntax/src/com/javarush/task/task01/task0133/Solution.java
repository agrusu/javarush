package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        int r = seconds / 3600;
        r = r * 3600;

        int rez = seconds - r;
        return rez;
        //напишите тут ваш код
    }
}