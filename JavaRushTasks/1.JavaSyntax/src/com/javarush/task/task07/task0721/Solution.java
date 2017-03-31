package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        //ArrayList<Integer> ar = new ArrayList<Integer>();
        int[] as = new int[20];
        for (int i = 0; i < 20; i++){
            as[i] = Integer.parseInt(reader.readLine());
        }

        maximum = as[0];
        minimum = maximum;

        for (int i = 0; i < as.length; i++){
            if(maximum < as[i]){
                maximum = as[i];
            }
            if(minimum > as[i]){
                minimum = as[i];
            }

        }

        System.out.print(maximum+" ");
        System.out.println(minimum);
    }
}
