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
        while (!isEven(this.numbers[position])) {
            position++;
        }

        return true;

    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    @Override
    public Object next() {

        if (hasNext()) {
            return this.numbers[position++];

        }
        return hasNext();
    }

}
