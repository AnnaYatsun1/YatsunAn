package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PrimeIt implements Iterator {
    public int position = 0;

    public PrimeIt(int[] numners) {
        this.numners = numners;
    }

    int[] numners;

    private static boolean primeNumber(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean hasNext() {
        for (int i = position; i < numners.length; i++) {
            if (!primeNumber(numners[i])) {
                return false;
            }
        }
        return true;
    }

    public Integer next() {
        for (int i = position; i < numners.length; i++) {
            if (primeNumber(numners[i])) {
                position = i+1;
                return numners[i];
            }
        }
        throw new NoSuchElementException();
    }

    public void remove() {

    }
}