package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк

Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.

Требования:
1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList.
2. Метод createList должен возвращать созданный массив.
3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
4. Программа должна выводить данные на экран.
5. Метод main должен вызывать метод createList.
6. Метод main должен вызывать метод printList.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[3];
        list[0] = new ArrayList<>();
        list[0].add("Ska");
        list[0].add("Sk1a");
        list[0].add("Sk2a");
        list[1] = new ArrayList<>();
        list[1].add("Ska");
        list[1].add("Sk1a");
        list[1].add("Sk2a");
        list[2] = new ArrayList<>();
        list[2].add("Ska");
        list[2].add("Sk1a");
        list[2].add("Sk2a");

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
