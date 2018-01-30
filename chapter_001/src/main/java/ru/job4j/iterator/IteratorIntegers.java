package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorIntegers implements Iterator {
    int position = 0;
    final int[] numbers;

    int sum = 0;

    public IteratorIntegers(final int[] numbers) {
        this.numbers = numbers;

    }
    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    @Override
    public boolean hasNext () {
        for (int i = position; i < numbers.length; i++) {
            if (isEven(numbers[i])) {
                position = i;
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer next () {
        if (hasNext()) {
            return this.numbers[position++];
        }
        throw new NoSuchElementException();
    }

}