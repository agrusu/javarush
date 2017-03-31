package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int top=0, left=0, width = 0, height = 0;

    public Rectangle(int left, int top, int width, int height) { //1
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int left, int top) { //2
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int left, int width, int height) { //3
        this.left = left;
        this.top = this.width;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle anoth) { //4
        this.left = anoth.left;
        this.top = anoth.top;
        this.width = anoth.width;
        this.height = anoth.height;
    }

    public static void main(String[] args) {

    }
}
