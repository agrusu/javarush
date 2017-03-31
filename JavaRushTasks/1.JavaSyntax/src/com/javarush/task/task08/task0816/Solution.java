package com.javarush.task.task08.task0816;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Tolean", new Date("APRIL 2 1982"));
        map.put("Lupu2",new Date ("MAY 3 1984"));
        map.put("Ursu",new Date ("JULY 4 1984"));
        map.put("Cucu",new Date ("JUNE 6 1986"));
        map.put("Ursu2",new Date ("MAY 7 1988"));
        map.put("Rusu",new Date ("FEBRUARY 8 1990"));
        map.put("Targon",new Date ("SEPTEMBER 9 1989"));
        map.put("Grecu",new Date ("JUNE 10 2000"));
        map.put("Lupu",new Date ("JUNE 15 1999"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        ArrayList<String> keys = new ArrayList<String>();
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            if ((pair.getValue().getMonth() >= 5) && (pair.getValue().getMonth() < 8)){
                keys.add(pair.getKey());
            }
        }
        for (String key : keys){
            map.remove(key);
        }
    }

    public static void main(String[] args) {
    }
}
