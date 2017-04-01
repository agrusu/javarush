package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace

Java имеет встроенный механизм, который позволяет отследить весь стек вызовов.
Делается это при помощи конструкции Thread.currentThread().getStackTrace().
Любой код в Java выполняется обязательно в каком-то потоке. При помощи
Thread.currentThread() получаем ссылку на текущий поток. Затем при помощи
getStackTrace() получаем весь стек вызовов или stack trace. В результате
получаем мы массив StackTraceElement[]. Каждый StackTraceElement содержит
информацию так нужную нам. Первое — это имя класса, из которого делался
или делается вызов. Второе — это имя метода, из которого делается вызов.
------------
В целях обучения, было бы неплохо добавить по умолчанию метод, который
распечатывал бы содержание стэка в цикле с комментариями и который вызывался
в конце каждого метода. Существенно увеличило бы отдачу от уроков и сэкономило
бы время на освоение материала.

я для себя написал вот такой метод:

public static void printStack (StackTraceElement[] st)
    {
        System.out.println("Текущий метод: " + st[1].getMethodName());
        System.out.println("Размер стека элементов: "+st.length);
        System.out.println("Содержание стека:");
        for (int i = 0; i < st.length; i++)
        {
            System.out.println("Индекс элемента: "+i+", значение элемента: "+st[i].getMethodName());
        }
        System.out.println("===============================");
        System.out.println("");
    }
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }
}

/*
public class ExceptionExample
{
  public static void main(String[] args)
  {
    method1();
  }

  public static void method1()
  {
    method2();
  }

  public static void method2()
  {
    method3();
  }

  public static void method3()
  {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements)
    {
       System.out.println(element.getMethodName());
    }
  }
}

 */