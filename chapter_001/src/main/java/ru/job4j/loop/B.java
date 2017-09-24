package ru.job4j.loop;

/**
 * Created by Анна on 08.09.2017.
 */
public class B extends A {


    static {
        System.out.println("static B");
    }

    {
        System.out.println("not static B");
    }

    public B() {
        System.out.println("Constructor B");
    }

    @Override
    public void notStaticMethod() {
        System.out.println("B");
    }

    public static void staticMethod() {
        System.out.println(" static B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.aMethod();
    }

    public void aMethod() {
        super.notStaticMethod();
        this.notStaticMethod();
    }

}