package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg z1=new Zerg();
        z1.name = "z1";
        Zerg z2=new Zerg();
        z2.name = "z12";
        Zerg z3=new Zerg();
        z3.name = "z13";
        Zerg z4=new Zerg();
        z4.name = "z14";
        Zerg z5=new Zerg();
        z5.name = "z15";
        Zerg z6=new Zerg();
        z6.name = "z16";
        Zerg z7=new Zerg();
        z7.name = "z17";
        Zerg z8=new Zerg();
        z8.name = "z18";
        Zerg z9=new Zerg();
        z9.name = "z19";
        Zerg z10=new Zerg();
        z10.name = "z10";

        Protoss p1=new Protoss();
        Protoss p12=new Protoss();
        Protoss p13=new Protoss();
        Protoss p14=new Protoss();
        Protoss p15=new Protoss();

        p1.name="p1";
        p12.name="p12";
        p13.name="p13";
        p14.name="p14";
        p15.name="p15";

        Terran t1 = new Terran();
        Terran t12 = new Terran();
        Terran t13 = new Terran();
        Terran t14 = new Terran();
        Terran t15 = new Terran();
        Terran t16 = new Terran();
        Terran t17 = new Terran();
        Terran t18 = new Terran();
        Terran t19 = new Terran();
        Terran t10 = new Terran();
        Terran t21 = new Terran();
        Terran t22 = new Terran();
        t1.name="a1";
        t12.name="a2";
        t13.name="a3";
        t14.name="a4";
        t15.name="a5";
        t16.name="aa1";
        t17.name="aa2";
        t18.name="aa3";
        t19.name="aa4";
        t10.name="aa5";
        t21.name="q1";
        t22.name="q2";
        //напишите тут ваш код
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
