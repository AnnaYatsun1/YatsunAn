package ru.job4j.AntonLesonss;

/**
 * Created by Анна on 03.09.2017.
 */

public class Cycles2 {
    public static void main(String[] args) {

        for (int a = 1; a < 10; a++) {
            for (int b = a; b > 0; b--) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
