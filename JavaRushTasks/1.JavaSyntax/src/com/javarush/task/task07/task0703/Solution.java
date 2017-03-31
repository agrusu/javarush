package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        final int N = 10;
        String[] s = new String[10];
        int[] a = new int[10];

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < s.length; i++){
            s[i] = bf.readLine();
        }
        for (int i = 0; i < s.length; i++){
            a[i] = s[i].length();
        }
        for (int i = 0; i < s.length; i++){
            System.out.println(a[i]);
        }

    }
}
