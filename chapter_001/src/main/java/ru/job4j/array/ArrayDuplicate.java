package ru.job4j.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Анна on 30.10.2017.
 */
public class ArrayDuplicate {
    public String[] remove(String[] array) {
        //String array [] = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        System.out.println(Arrays.toString(array));
        System.out.println(new HashSet<String>(Arrays.asList(array)));
        System.out.println( Arrays.toString(new HashSet<String>(Arrays.asList(array)).toArray(new String[new HashSet<String>(Arrays.asList(array)).size()])));
        return  new HashSet<String>(Arrays.asList(array)).toArray(new String[new HashSet<String>(Arrays.asList(array)).size()]);
    }


}