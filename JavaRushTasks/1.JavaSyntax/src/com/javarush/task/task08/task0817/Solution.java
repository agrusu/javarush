package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> hm = new HashMap<String, String>();
        hm.put("Rusu", "Andrei");
        hm.put("Ursu","Andrei");
        hm.put("Lupu","Marioara");
        hm.put("Ursu2","Ion");
        hm.put("Cucu","Ion");
        hm.put("Ursu3","Mihai");
        hm.put("Rusu2","Mihai");
        hm.put("Targon","Ion");
        hm.put("Grecu","Mihai");
        hm.put("Lupu4","Maria");

        return (HashMap<String, String>) hm;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        for(Map.Entry<String,String> pairA : map.entrySet()){
            for(Map.Entry<String,String> pairB : map.entrySet()){
                if(pairA.getKey().equals(pairB.getKey())) continue;
                if(pairA.getValue().equals(pairB.getValue())){
                    set.add(pairB.getKey());
                    set.add(pairA.getKey());
                    System.out.println("A = "+pairA+";  B = "+pairB);
                    System.out.println("sset = "+set);
                }
            }
        }
        System.out.println("Set = "+set);
        for (String key : set){
            //String value = map.get(key);
            removeItemFromMapByValue(map, map.get(key));
            //System.out.println("--------");
            //System.out.println(map.get(key));
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)){
                System.out.println("Pair to remove === " + pair);
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String,String> hm = createMap();
        System.out.println(hm);
        System.out.println(hm.size());
        removeTheFirstNameDuplicates(hm);
        System.out.println(hm);
        System.out.println(hm.size());

    }
}