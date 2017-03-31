package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        float t = Float.parseFloat(bf.readLine());
        int i = (int) t/5;
        float tt = t - i*5;
        t=tt;
        if (t < 3) System.out.println("зелёный");
        else if (t < 4) System.out.println("желтый");
        else System.out.println("красный");
    }
}