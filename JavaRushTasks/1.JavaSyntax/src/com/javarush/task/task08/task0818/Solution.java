package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Rusu",400);
        map.put("Ursu",600);
        map.put("Piatra",300);
        map.put("Grecu",400);
        map.put("Cojoc",200);
        map.put("Negru",700);
        map.put("Albu",500);
        map.put("Minciuna",100);
        map.put("Miau",440);
        map.put("Costea",330);
        return (HashMap<String, Integer>) map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String,Integer> copy = new HashMap<String, Integer>(map);
        for (Map.Entry<String,Integer> pair : copy.entrySet()) {
            if(pair.getValue() < 500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
