package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        String name = elements[2].getClassName();
        String method = elements[2].getMethodName();
        String rez = name + ": " + method + ": " + s;
        System.out.println(rez);
    }
}
