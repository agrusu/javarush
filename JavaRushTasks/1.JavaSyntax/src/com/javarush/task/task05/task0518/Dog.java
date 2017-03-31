package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек - Имя, рост, цвет
*/


public class Dog {
    //напишите тут ваш код
    String name;
    int height;
    String color;

    public Dog(String n){
        name = n;
    }
    public Dog(String n,int h){
        name = n;
        height = h;
    }
    public Dog(String n,int h, String c){
        name = n;
        height = h;
        color = c;
    }

    public static void main(String[] args) {

    }
}
