package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int N = 10;
        int i = 0;
        while (i < N) {
            i++;
            int j = 0;
            while (j < N) {
                j++;
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

    }
}