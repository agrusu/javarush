package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Метод в try..catch
Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Обернуть все тело (код внутри readData) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен
перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Метод main не изменять.
3. Метод main не должен кидать исключений.
4. Метод readData должен содержать блок try..catch.
5. Если пользователь ввел текст, а не число, программа должна вывести все ранее введенные числа.
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> ar = new ArrayList<Integer>();
        try {
            while (true){
                int x = Integer.parseInt(bf.readLine());
                ar.add(x);
            }
        } catch (NumberFormatException e) {
//            System.out.println("+++++++++++" + 1);
            for (int i = 0; i < ar.size(); i++){
                System.out.println(ar.get(i));
            }
            //           e.printStackTrace();
        } catch (IOException e) {
//            System.out.println("+++++++++++" + 2);
            e.printStackTrace();
        }
    }
}
