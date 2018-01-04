package ru.job4j.iterator;

import java.util.Iterator;

public class PrimeIt implements Iterator {
    public int position = 0;

    public PrimeIt(int[] numners) {
        this.numners = numners;
    }

    int[] numners;

    private static int primeNumber(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public boolean hasNext() {
        for (int i = position; i < numners.length-1; i++) {
            if (primeNumber(numners[i]) == 1) {
                return true;
            }
        }
        return false;
    }

    public Integer next() {
        for (int i = position; i < numners.length; i++) {
            if (primeNumber(numners[i]) == 1) {
                position =  i == numners.length ?  i :  i + 1;
                return numners[i];
            }
        }
        return -1;
    }

    public void remove() {

    }
}