package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        int t;
        if (b > a) {
            t = b;
            b = a;
            a = t;
        }
        if (c > b) {
            t = c;
            c = b;
            b = t;
        }
        if (b > a) {
            t = b;
            b = a;
            a = t;
        }
        if (c > b) {
            t = c;
            c = b;
            b = t;
        }

        System.out.println(a + " " + b + " " + c);
    }
}