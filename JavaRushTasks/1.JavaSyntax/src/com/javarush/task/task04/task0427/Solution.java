package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        boolean par = (0 == a % 2);
        String s1, s2;
        if ((a > 0) && (a < 1000))
        {
            if (a < 10)
                s1 = "однозначное";
            else if (a < 100)
                s1 = "двузначное";
            else
                s1 = "трехзначное";
            if (par)
                s2 = "четное";
            else
                s2 = "нечетное";
            System.out.println(s2 + " " + s1 + " число");
        }
    }
}
