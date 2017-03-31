package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        boolean con = true;
        int cat;
        int rest;
        while (con){
            cat = a / 10;
            rest = a % 10;
//            System.out.println(a + " " + cat + " " + rest);
            if ((rest % 2) == 0)
                even++;
            else
                odd++;
            a = cat;
            con = (cat != 0);
        }
        System.out.print("Even: "+even+" Odd: "+odd);
        //напишите тут ваш код
    }
}
