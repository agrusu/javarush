package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();
        String s = bf.readLine();

        if (a.equals(s))
            System.out.println("Имена идентичны");
        else if (a.length()==s.length())
            System.out.println("Длины имен равны");
    }
}