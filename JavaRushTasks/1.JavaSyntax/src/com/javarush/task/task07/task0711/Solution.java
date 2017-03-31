package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> ar = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<5; i++){
            ar.add(bf.readLine());
        }

        for (int i = 0; i < 13; i++){
            int k = ar.size();
            String s = ar.get(k-1);
            ar.add(0,s);
            ar.remove(k);
        }
        for(int i = 0; i < ar.size(); i++){
            System.out.println(ar.get(i));
        }
    }
}
