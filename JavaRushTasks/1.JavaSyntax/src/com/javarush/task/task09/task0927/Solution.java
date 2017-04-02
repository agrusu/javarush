package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
Есть класс кот – Cat, с полем «имя» (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех котов и вывести его на экран.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен объявлять и инициализировать переменную типа HashMap.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        Cat c1 = new Cat("eu");
        Cat c2 = new Cat("tu");
        Cat c3 = new Cat("el");
        Cat c4 = new Cat("ea");
        Cat c5 = new Cat("noi");
        Cat c6 = new Cat("voi");
        Cat c7 = new Cat("ei");
        Cat c8 = new Cat("ele");
        Cat c9 = new Cat("Ich");
        Cat c0 = new Cat("Ileana");
        map.put(c1.name,c1);
        map.put(c2.name,c2);
        map.put(c3.name,c3);
        map.put(c4.name,c4);
        map.put(c5.name,c5);
        map.put(c6.name,c6);
        map.put(c8.name,c8);
        map.put(c7.name,c7);
        map.put(c9.name,c9);
        map.put(c0.name,c0);
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet cats = new HashSet<Cat>();
        for (String s : map.keySet())
            cats.add(map.get(s));
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
