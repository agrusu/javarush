package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        //int a=5, b=5, c=11;

        if (((a+b) > c) && ((a+c) > b) && ((b+c) > a))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");

    }
}