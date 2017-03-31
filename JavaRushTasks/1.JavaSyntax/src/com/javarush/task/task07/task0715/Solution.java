package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        ArrayList<String> ar = new ArrayList<String>(
//                Arrays.asList("мама", "мыла", "раму"));
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("мама"); ar.add("мыла"); ar.add("раму");
        for(int i = 0; i < ar.size(); ){
            ar.add(i+1,"именно");
            i++; i++;
        }
        for(int i=0; i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
