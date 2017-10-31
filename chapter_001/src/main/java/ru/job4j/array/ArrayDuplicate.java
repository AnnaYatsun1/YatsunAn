package ru.job4j.array;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Created by Анна on 30.10.2017.
 */
public class ArrayDuplicate {
    public String[] remove(String[] array) {
//        Object [] distinct =  Stream.of(array).distinct().toArray();
//        return  Arrays.copyOf(distinct, distinct.length, String[].class);
        Set<String> set = new HashSet<>(Arrays.asList(array));
        String[] result = set.toArray(new String[set.size()]);

         return result;
    }
}