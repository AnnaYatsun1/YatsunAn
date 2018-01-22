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


    @Override
    public boolean hasNext() {
        for (int i = 0; i < numbers.length; i++) {
            if (isEven(i)) {
                return true;
            }
        }

        return false;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    @Override
    public Integer next() {
        for (int i = 0; i < numbers.length; i++) {
            if (isEven(i)) {
                position = i + 1;
                return this.numbers[i];
            }

        }
        throw new NoSuchElementException();
    }

}