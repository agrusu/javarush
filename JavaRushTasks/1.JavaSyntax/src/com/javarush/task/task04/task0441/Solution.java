package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        // Determinam min
        int min = Math.min(Math.min(a,b),c);
        // Deteminam max
        int max = Math.max(Math.max(a,b),c);
        // Valoarea intermediara
        int rez = (a + b + c) - max - min;
        System.out.println(rez);
    }
}
