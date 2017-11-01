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
        int dublicate = array.length;
        for (int out = 0; out <dublicate ; out++) {
            for (int in = out+1; in <  dublicate; in++) {
                if(array[out].equals(array[in])){
                    array[in]=array[dublicate-1];
                    dublicate--;
                    in--;

                }
                
            }
            
        }
         return Arrays.copyOf(array,dublicate);
    }
}