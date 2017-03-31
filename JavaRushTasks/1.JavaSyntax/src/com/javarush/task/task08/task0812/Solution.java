package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            ar.add(new Integer(Integer.parseInt(bf.readLine())));
        }
/*
        for (int i = 0; i < 10; i++){
            System.out.print(ar.get(i));
        }
        System.out.println("\n---------------\n");
*/
        int max = 1;
        int k = 1;

        for (int i = 0; i < ar.size()-1; i++) {
            if (ar.get(i).equals(ar.get(i+1))){
                k++;
                if (k > max) {
                    max = k;
                }
            }
            else {
                k = 1;
            }
//            System.out.println(max + " " + k);
        }


        System.out.println(max);
    }
}