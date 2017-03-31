package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
— centerX, centerY, radius, width, color
*/

public class Circle {
    //напишите тут ваш код
    int centerX, centerY, radius, width;
    int color;
     public void initialize (int x, int y, int r){
         centerX = x;
         centerY = y;
         radius = r;
     }
    public void initialize (int x, int y, int r, int w){
        centerX = x;
        centerY = y;
        radius = r;
        width = w;
    }
    public void initialize (int x, int y, int r, int w, int c){
        centerX = x;
        centerY = y;
        radius = r;
        width = w;
        color = c;
    }

    public static void main(String[] args) {

    }
}
