package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int r = number % 10;
        int s = r;
        number = number / 10;
        r = number % 10;
        s = s + r;
        number = number / 10;
        s = s + number;
        return s;
        //напишите тут ваш код
    }
}