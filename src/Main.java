package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(MathClass.sum(3,5));

//        MathClass mathClass1 = new MathClass(435);
//        MathClass mathClass2 = new MathClass(765);
//        MathClass mathClass3 = new MathClass(78);
//        MathClass mathClass4 = new MathClass(34);
//        MathClass mathClass5 = new MathClass(768);
//
//        System.out.println(MathClass.getCounter());
//
//        System.out.println(mathClass1.getData());
//        System.out.println(mathClass2.getData());
//        System.out.println(mathClass3.getData());
//        System.out.println(mathClass4.getData());
//        System.out.println(mathClass5.getData());


//
//        Hero hero = new Hero("Nakamoto");
//
//        System.out.println(hero.getHeroData());

        Man man1 = new Man("Vasya", 13);
        //Man man2 = man1;//new Man("Vasya", 13);
        //man2.setAge(10);

        //Man man2 = new Man(man1.getName(), man1.getAge());

        Man man2 = new Man(man1);

        man2.setAge(10);

        System.out.println(man1.getAsString());
        System.out.println(man2.getAsString());

        System.out.println(man1.myEquals(man2));
    }
}