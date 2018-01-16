package ru.job4j.list;

import java.util.*;

public class SimpleSeet implements SimpleContainer<String> {
    int lengh;
    int position;
    String[] mass = new String[lengh];

    public SimpleSeet(int lengh, int position, String[] mass) {
        this.lengh = lengh;
        this.position = position;
        this.mass = mass;
    }


    @Override
    public void add(String item) {
        if (!contains(item)) {
            mass[position++] = item;
            //  position++;
        }

    }


    public boolean contains(String v) {
        for (final String e : mass)
            if (v != null && v.equals(e)) {
                return true;
            }


        return false;
    }


    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                if (lengh == mass.length) {
                    return false;
                }
                return true;
            }

            @Override
            public String next() {
                if (hasNext()) {
                    return mass[position++];
                }

                throw new NoSuchElementException();

            }
        };
    }

    Set<String> set = new HashSet<String>(Arrays.asList(mass));

}

