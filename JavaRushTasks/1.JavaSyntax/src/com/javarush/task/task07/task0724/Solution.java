package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

/*
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human bunica = new Human("Valentina", false, 78);
        Human bunelul = new Human("Gheorghe", true, 80);
        Human mamuca = new Human("Iulia",false, 85);
        Human tatuca = new Human("Stefan", true, 89);
        Human mama = new Human("Elena", false, 48, tatuca, mamuca);
        Human tata = new Human("Andrei", true, 49, bunelul, bunica);
        Human anisoara = new Human("Anisoara", false, 27, tata, mama);
        Human ion = new Human("Ion", true, 25, tata, mama);
        Human maria = new Human("Maria", false, 22, tata, mama);

        System.out.println(bunica.toString());
        System.out.println(bunelul.toString());
        System.out.println(mamuca.toString());
        System.out.println(tatuca.toString());
        System.out.println(mama.toString());
        System.out.println(tata.toString());
        System.out.println(anisoara.toString());
        System.out.println(ion.toString());
        System.out.println(maria.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String n, Boolean s, int a){
            name = n; sex = s; age = a;
        }
        public Human(String n, Boolean s, int a, Human t, Human m){
            name = n; sex = s; age = a; father = t; mother = m;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human ded1 = new Human("Vasya", true, 60);
        Human babka1 = new Human("Masha", false, 55);
        Human ded2 = new Human("Vitya", true, 63);
        Human babka2 = new Human("Katya", true, 53);
        Human papa = new Human("Lesha", true, 30, ded1, babka1);
        Human mama = new Human("Lyuba", false, 25, ded2, babka2);
        Human syn1 = new Human("Pasha", true, 10, papa, mama);
        Human syn2 = new Human("Kostya", true, 5, papa, mama);
        Human dochka = new Human("Sofiya", false, 2, papa, mama);

        System.out.println(ded1.toString());
        System.out.println(babka1.toString());
        System.out.println(ded2.toString());
        System.out.println(babka2.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(syn1.toString());
        System.out.println(syn2.toString());
        System.out.println(dochka.toString());
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        public Human (String name, boolean sex, int age) {
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}



















