package com.sbt.jscool;

import com.sbt.jscool.person.Person;

public class Main {

    public static Person man;
    public static Person woman;

    public static void main(String[] args) {
        Person man1 = new Person(true, "Ivan");
        Person man2 = new Person(true, "Petr");
        Person woman1 = new Person(false, "Katya");
        Person woman2 = new Person(false, "Masha");
        System.out.println(man1.marry(man2));
        System.out.println(man1.marry(woman1));
        System.out.println(man2.marry(woman2));
        System.out.println(man1.marry(woman2));
        System.out.println(man1.getSpouse().getName());
    }
}
