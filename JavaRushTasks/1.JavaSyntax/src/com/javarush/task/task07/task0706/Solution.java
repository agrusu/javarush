package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] a = new int[15];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(bf.readLine());
        }
        int par = 0, impar = 0;
        for (int i = 0; i < a.length; i++){
            if(i%2 == 0)
                par = par + a[i];
            else
                impar = impar + a[i];
        }
        if (par > impar)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
