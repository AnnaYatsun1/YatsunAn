package ru.job4j.iterator;

import java.util.Iterator;

public class IteratorIntegers implements Iterator {
    int position = 0;

    int sum = 0;

    public IteratorIntegers(final int[] numbers) {
        this.numbers = numbers;
    }

    //    Iterator it = new IteratorIntegers(new int[]{4, 2, 1, 1});
    final int[] numbers;


    @Override
    public boolean hasNext() {
        if (numbers[position] % 2 == 0)
            return true;
        else
            return false;

    }

    @Override
    public Object next() {
        int element = 0;
        int position = 0;
     for (int x = 0; x < numbers.length; x++) {
            if (numbers[position] % 2 == 0) {
                element = numbers[position];
                System.out.println(element);
            }


    }
        return element;
    }
}