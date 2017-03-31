package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> orig = new ArrayList<Integer>();
        ArrayList<Integer> o3 = new ArrayList<Integer>();
        ArrayList<Integer> o2 = new ArrayList<Integer>();
        ArrayList<Integer> rest = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++){
            orig.add(Integer.parseInt(bf.readLine()));
        }

        for (int i = 0; i < 20; i++){
            if(orig.get(i) % 3 == 0)
                o3.add(orig.get(i));
        }
        for (int i = 0; i < 20; i++){
            if(orig.get(i) % 2 == 0)
                o2.add(orig.get(i));
        }
        for (int i = 0; i < 20; i++){
            if ((orig.get(i) % 3 != 0) && (orig.get(i) % 2 != 0))
                rest.add(orig.get(i));
        }

        printList(o3);
        printList(o2);
        printList(rest);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
//        System.out.println("--------------");
        for (Integer x : list){
            System.out.println(x);
        }
//        System.out.println("--------------");
    }
}
