package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        boolean par = (0 == a % 2);
        boolean pozitiv = (a > 0);
        String s1, s2;
        if (a==0)
            System.out.println("ноль");
        else {
            if (pozitiv)
                s1 = "положительное";
            else
                s1 = "отрицательное";
            if (par)
                s2 = "четное";
            else
                s2 = "нечетное";
            System.out.println(s1 + " " + s2 + " число");
        }
    }
}
