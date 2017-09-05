package ru.job4j.arrey;
import java.util.Arrays;

/**
 * Created by Анна on 04.09.2017.
 */
public class Turn {
    public static int[] back(int[] array) {
        int length = array.length;
        int half = array.length / 2;
        for (int i = 0; i < half; i++) {
            array[i] ^= array[length - i - 1];
            array[length - i - 1] ^= array[i];
            array[i] ^= array[length - i - 1];
        }
       return array;
    }
}