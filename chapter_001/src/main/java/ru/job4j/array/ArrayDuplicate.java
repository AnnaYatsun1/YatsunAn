package ru.job4j.array;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Анна on 30.10.2017.
 */
public class ArrayDuplicate {
    public String[] remove(String[] array) {
        Object [] distinct =  Stream.of(array).distinct().toArray();
        return  Arrays.copyOf(distinct, distinct.length, String[].class);
    }
}