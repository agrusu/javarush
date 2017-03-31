package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String a = "Мама";
        String b = "Мыла";
        String c = "Раму";
        System.out.println(sss(a,b,c));
        System.out.println(sss(a,c,b));
        System.out.println(sss(b,a,c));
        System.out.println(sss(b,c,a));
        System.out.println(sss(c,a,b));
        System.out.println(sss(c,b,a));

        //напишите тут ваш код
    }
    public static String sss(String a, String b, String c){
        return a+b+c;
    }
}
