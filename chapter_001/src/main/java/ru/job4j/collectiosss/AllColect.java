package ru.job4j.collectiosss;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * Created by Анна on 28.11.2017.
 */
public class AllColect {

    public long add() {
        Collection<String> collection; int amount=10;

        collection= new ArrayList<>();
        long start = System.nanoTime();
        amount = 8;
      int   n = 6;
        String string = "abcdefgklmoprstklm";
        String stringramdom = "";
       Random random = new Random();
        for (int j = 0; j < amount; j++) {
            char[] text = new char[amount];
            for (int i = 0; i < amount; i++) {
                text[i] = string.charAt(random.nextInt((string.length())));
            }
            for (int i = 0; i < text.length; i++) {
                stringramdom += text[i];
            }
            collection.add(stringramdom);
        }


        long finish = System.nanoTime();
        long result = finish - start;


        System.out.println(collection);
        return result;
    }
    public long delete(Collection<String> collection, int amount) {
        int n=2;
        collection.remove(n);
    //   collection.subList(0, n).clear();
        System.out.println(collection);
        long finish = System.nanoTime();
        return finish;
    }
}
