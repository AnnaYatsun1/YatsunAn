package ru.job4j.loop;

/**
 * Created by Анна on 08.09.2017.
 */
public class A {


    public void notStaticMethod(){
        System.out.println("A");
    }

    public static void staticMethod(){
        System.out.println("static A");
    }

    static {
        System.out.println("static A");
    }

    {
        System.out.println("not static A");
    }

    public A() {
        System.out.println("Constructor A");
    }


}
