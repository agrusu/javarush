package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
/*
арбуз — ягода,
банан — трава,
вишня — ягода,
груша — фрукт,
дыня — овощ,
ежевика — куст,
жень-шень — корень,
земляника — ягода,
ирис — цветок,
картофель — клубень.
 */
        HashMap<String, String> hm = new HashMap<String,String>();

        hm.put("арбуз","ягода");
        hm.put("банан","трава");
        hm.put("вишня","ягода");
        hm.put("груша","фрукт");
        hm.put("дыня","овощ");
        hm.put("ежевика","куст");
        hm.put("жень-шень","корень");
        hm.put("земляника","ягода");
        hm.put("ирис","цветок");
        hm.put("картофель","клубень");

        // картофель - клубень

        for(Map.Entry<String, String> pair : hm.entrySet()){
            String key = pair.getKey();
            String value = pair.getValue();

            System.out.println(key + " - " + value);
        }

    }
}
