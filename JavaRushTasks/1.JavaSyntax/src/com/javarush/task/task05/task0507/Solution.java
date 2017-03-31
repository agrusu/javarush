package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int r = 0;
        float media = 0;
        int k = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

            r = Integer.parseInt(bf.readLine());
            if (r != -1) {
                k++;
                media += r;
            } else {
                media = media / k;
                System.out.println(media);
                break;
            }
        }
    }
}

