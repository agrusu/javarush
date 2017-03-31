package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String>  ar = new ArrayList<String>();
        for (int i = 0; i<5; i++){
            ar.add("Andrei "+i);
        }
        System.out.println(ar.size());
        for (int i = 0; i<5; i++){
            System.out.println(ar.get(i));
        }
    }
}
