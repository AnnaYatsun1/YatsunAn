package ru.job4j.iterator;

import java.util.Iterator;

public class IteratorIntegers implements Iterator {
    int position = 0;
    int element;
    int sum = 0;

    public IteratorIntegers(final int[] numbers) {
        this.numbers = numbers;
    }

    //    Iterator it = new IteratorIntegers(new int[]{4, 2, 1, 1});
    final int[] numbers;


    @Override
    public boolean hasNext() {

            return numbers[position]%2==0;
            ////
    }

    @Override
    public Object next() {
        if (position < numbers.length&&numbers[++position]%2==0 )
            return numbers[position];
        else return next();


    }
}