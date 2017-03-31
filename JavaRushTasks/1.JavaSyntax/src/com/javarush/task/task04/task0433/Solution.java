package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int N = 10;
        int i = 0;
        while (i < N) {
            int j = 0;
            while (j < N) {
                System.out.print("S");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}