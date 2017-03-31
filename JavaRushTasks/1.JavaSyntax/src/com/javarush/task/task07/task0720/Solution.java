package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        ArrayList<String> ar = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            ar.add(reader.readLine());
        }

        for (int i = 0; i < M; i++){
            ar.add(ar.get(0));
            ar.remove(0);
        }

        for (String x : ar){
            System.out.println(x);
        }
    }
}
