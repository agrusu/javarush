package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        int k = 0;
        int j = 0;

        if (a > 0) k++;
        if (b > 0) k++;
        if (c > 0) k++;

        if (a < 0) j++;
        if (b < 0) j++;
        if (c < 0) j++;

        System.out.println("количество отрицательных чисел: " + j);
        System.out.println("количество положительных чисел: " + k);
    }
}
