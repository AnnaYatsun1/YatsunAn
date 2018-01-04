package ru.job4j.iterator;

import java.util.Iterator;

public class PrimeIt implements Iterator {
    final int[] value;
    int positiom;


    public PrimeIt(int[] value) {
        this.value = value;
    }

    private static int primeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }

            if ((i > Math.sqrt(number))) {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public boolean hasNext() {
        for (int i = 0; i < value.length; i++) {
            if (primeNumber(value[i]) == 1) {
                value[i]=value[i];
            }

        return true;

    }



    @Override
    public Object next() {

        return this.value[positiom++];


    }

}