package ru.job4j.iterator;


import java.util.Iterator;

public class IteratorArray implements Iterator {

    final int[][] value;
    int position = 0;
    int position2 = 0;
    int lengthOfArray = 0;

    public IteratorArray(final int[][] value) {
        this.value = value;
        for (int i = 0; i < value.length; i++) {
            lengthOfArray += value[i].length;
        }
    }


    @Override
    public boolean hasNext() {
        return lengthOfArray > 0;

    }


    @Override
    public Object next() {
        lengthOfArray--;
        if (position2 < value[position].length) {
            return value[position][position2++];
        } else {
            position2 = 0;
            return value[++position][position2++];
        }
    }



}
