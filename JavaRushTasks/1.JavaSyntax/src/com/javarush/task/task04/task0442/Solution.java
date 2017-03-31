package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int r = 0;
        int suma = 0;
        while (r != -1){
            r = Integer.parseInt(bf.readLine());
            suma += r;
        }
        System.out.println(suma);
    }
}
