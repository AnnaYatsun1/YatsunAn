package ru.job4j.iterator;


import java.util.Iterator;

public class IteratorArray implements Iterator {

    final int[][] value;
    int row = 0;
    int cell = 0;


    public IteratorArray(final int[][] value) {
        this.value = value;

    }


    @Override
    public boolean hasNext() {

        return this.value[row].length >cell || this.value.length>row;

    }


    @Override
    public Object next() {
        try {
            if (hasNext()) {
                return value[row++][row];
            }
        }
        catch (NullPointerException ex){
            System.out.println(ex);
        }

        return value;

    }



}
