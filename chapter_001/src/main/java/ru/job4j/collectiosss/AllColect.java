package ru.job4j.collectiosss;

import java.util.*;

public class AllColect {
    public long add(Collection<String> collection, int amount) {
        long start = System.nanoTime();
        collection = new ArrayList<>();
        createRandomeString(collection);
        System.out.println(createRandomeString(collection));
        long finish = System.nanoTime();
        System.out.println("Time in ArrayList-" + (finish - start));
        long start1 = System.nanoTime();
        collection = new LinkedList<>();
        createRandomeString(collection);
        System.out.println(createRandomeString(collection));
        long finish1 = System.nanoTime();
        System.out.println("Time in LinkedList-" + (finish1 - start1));
        long start2 = System.nanoTime();
        collection = new TreeSet<>();
        createRandomeString(collection);
        System.out.println(createRandomeString(collection));
        long finish2 = System.nanoTime();
        System.out.println("Time in TreeSet-" + (finish2 - start1));

        return finish - start;
    }

    public Collection createRandomeString(Collection<String> collection) {
        int amount = 5;
        long start2 = System.nanoTime();
        String string2 = "abcdefgklmoprstklmnoppqwrst";
        String stringramdom2 = "";
        Random random2 = new Random();
        for (int j = 0; j < amount; j++) {
            char[] text = new char[amount];
            for (int i = 0; i < amount; i++) {
                text[i] = string2.charAt(random2.nextInt((string2.length())));
            }
            for (int i = 0; i < text.length; i++) {
                stringramdom2 += text[i];
            }
            collection.add(stringramdom2);
        }
        long finish2 = System.nanoTime();
        long result2 = finish2 - start2;
        return collection;
    }


    public long delete(Collection<String> collection, int amount) {
        int n = 3;
        amount = 8;
        long start2 = System.nanoTime();
        String string2 = "abcdefgklmoprstklm";
        String stringramdom2 = "";
        Random random2 = new Random();
        for (int j = 0; j < amount; j++) {
            char[] text = new char[amount];
            for (int i = 0; i < amount; i++) {
                text[i] = string2.charAt(random2.nextInt((string2.length())));
            }
            for (int i = 0; i < text.length; i++) {
                stringramdom2 += text[i];
            }
            collection.add(stringramdom2);
            System.out.println(stringramdom2);
        }

        collection.removeAll(collection);
        System.out.println(collection);

        long finish2 = System.nanoTime();
        long result2 = finish2 - start2;

        return result2;
    }


    public static void main(String[] args) {
        Collection<String> collection = new LinkedList<>();
        Collection<String> collection1 = new ArrayList<>();
        Collection<String> collection2 = new TreeSet<>();


        int amount = 3;
        AllColect allColect = new AllColect();
        //      allColect.add(collection, amount);
        // allColect.add(collection1, amount);
        // allColect.add(collection2, amount);
        allColect.delete(collection, amount);
    }
}
