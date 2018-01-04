package ru.job4j.iterator;


import java.util.Iterator;

public class IteratorArray implements Iterator {

    final int[][] value;
    int row = 0;
    int cell = 0;
    int position = 0, position2 = 0;


    public IteratorArray(final int[][] value) {
        this.value = value;

    }

    @Override
    public boolean hasNext() {

        return this.value[position].length > position2 || this.value.length > position;

    }
   @Override
    public Object next() {

        if (hasNext()) {
            if (position2 < value[position].length) {
                return value[position][position2++];
            } else {
                position2 = 0;
                return value[++position][position2++];
            }

        }
        return hasNext();


    }
}