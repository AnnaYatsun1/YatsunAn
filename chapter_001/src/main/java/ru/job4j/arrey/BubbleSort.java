package ru.job4j.arrey;

/**
 * Created by Анна on 05.09.2017.
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        //сщь
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }
        return array;
    }
}
