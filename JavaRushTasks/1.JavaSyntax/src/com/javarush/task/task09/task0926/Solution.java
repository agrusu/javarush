package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел

Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.

Требования:

1. Метод createList должен объявлять и инициализировать переменную типа ArrayList.
2. Метод createList должен возвращать созданный список.
3. Метод createList должен добавлять в список 5 элементов.
4. Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2, следующих - 4, 7, 0 соответственно.
5. Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> ar = new ArrayList<int[]>();
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7};
        int[] a3 = {11,12,13,14};
        int[] a4 = {21,22,23,24,25,26,27};
        int[] a5 = {};
        ar.add(a1);
        ar.add(a2);
        ar.add(a3);
        ar.add(a4);
        ar.add(a5);
        return ar;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
