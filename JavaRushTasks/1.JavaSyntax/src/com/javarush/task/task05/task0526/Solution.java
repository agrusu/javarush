package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man m1 = new Man("aa1",22,"Chisinau");
        Man m2 = new Man("bb2",33,"Chisinau2");
        Woman w1 = new Woman("ee1", 44,"Orhei");
        Woman w2 = new Woman("vv2", 55,"Cahul");
/*
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(w1);
        System.out.println(w2);
*/
        System.out.println(m1.name+" "+m1.age+" "+m1.address);
        System.out.println(m2.name+" "+m2.age+" "+m2.address);
        System.out.println(w1.name+" "+w1.age+" "+w1.address);
        System.out.println(w2.name+" "+w2.age+" "+w2.address);
    }

    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String n, int a, String d){
            name = n;
            age = a;
            address = d;
        }
        public String toString(){
            return name+" "+age+" "+address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String n, int a, String d){
            name = n;
            age = a;
            address = d;
        }
        public String toString(){
            return name+" "+age+" "+address;
        }
    }
}
