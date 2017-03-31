package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> ar = new ArrayList<Human>();
        Human bunica = new Human();
        Human bunelu = new Human();
        Human mamuca = new Human();
        Human tatuca = new Human();
        Human mama = new Human();
        Human tata = new Human();

        Human ion = new Human();
        Human nelu = new Human();
        Human maria = new Human();

        ar.add(bunica);
        ar.add(bunelu);
        ar.add(mamuca);
        ar.add(tatuca);
        ar.add(mama);
        ar.add(tata);
        ar.add(ion);
        ar.add(nelu);
        ar.add(maria);

        bunica.name = "Valentina";
        bunica.sex = false;
        bunica.age = 80;
        bunica.children.add(mama);
        bunelu.name = "Gheorghe";
        bunelu.sex = true;
        bunelu.age = 82;
        bunelu.children.add(mama);
        mama.name = "Lenuta";
        mama.sex = false;
        mama.age = 50;
        mama.children.add(ion);
        mama.children.add(nelu);
        mama.children.add(maria);

        mamuca.name = "Iulia";
        mamuca.sex = false;
        mamuca.age = 85;
        mamuca.children.add(tata);
        tatuca.name = "Tudor";
        tatuca.sex = true;
        tatuca.age = 88;
        tatuca.children.add(tata);

        tata.name = "Andrei";
        tata.sex = true;
        tata.age = 55;
        tata.children.add(ion);
        tata.children.add(nelu);
        tata.children.add(maria);

        ion.name = "Ion";
        ion.sex = true;
        ion.age = 25;

        nelu.name = "Nelu";
        nelu.sex = true;
        nelu.age = 20;

        maria.name = "Maria";
        maria.sex = false;
        maria.age = 15;


        for(Human aa : ar){
            System.out.println(aa);
        }
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
