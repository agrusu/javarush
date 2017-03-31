package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < 20; i++){
            hs.add(new Integer(i+3));
        }
        return hs;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator iterator = set.iterator();

        while(iterator.hasNext())
        {
            if ((int)iterator.next() > 10)
            {
                iterator.remove();
            }

        }

        return set;

/*
        for (Integer x : set){
            if (x > 10) {
                set.remove(x);
            }
        }
*/
    }

    public static void main(String[] args) {
/*
        HashSet<Integer> hss = new HashSet<Integer>(createSet());

        System.out.println(hss);
        removeAllNumbersMoreThan10(hss);
        System.out.println(hss);
*/
    }
}
