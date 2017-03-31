package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> ar = new ArrayList<String>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            ar.add(bf.readLine());
        }
        int kmin = 0;
        int kmax = 0;
        int imin = ar.get(0).length();
        int imax = ar.get(0).length();
        for (int i = 1; i < 10; i++){
            if (ar.get(i).length() > imax) {
                imax = ar.get(i).length();
                kmax = i;
            }
            if (ar.get(i).length() < imin) {
                imin = ar.get(i).length();
                kmin = i;
            }
        }
        if(kmin < kmax) {
            System.out.println(ar.get(kmin));
        }
        else{
            System.out.println(ar.get(kmax));
        }
    }
}
