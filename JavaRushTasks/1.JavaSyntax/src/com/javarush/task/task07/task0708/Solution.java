package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> ar = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<5; i++){
            ar.add(bf.readLine());
        }
        int kmx=0;
        int lmx=ar.get(0).length();
        for (int i = 1; i < 5; i++){
            if (lmx < ar.get(i).length()){
                kmx = i;
                lmx = ar.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++){
            if (ar.get(i).length() == lmx) {
                System.out.println(ar.get(i));
            }
        }
    }
}
