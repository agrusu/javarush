package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
Имя, возраст, пол
*/

public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex;

    public Friend(String n){
        name = n;
    }
    public Friend(String n, int a){
        name = n;
        age = a;
    }
    public Friend(String n, int a, char x){
        name = n;
        age = a;
        sex = x;
    }


    public static void main(String[] args) {

    }
}
