package ru.job4j.list;

import proffe.Tetet;

import java.util.*;

public class SimpleSeet<E> implements SimpleContainer<E> {
  private   int lengh;
   private int position=0;
   private E[] mass ;

    public SimpleSeet(int lengh, int position, E[] mass) {
        this.lengh = lengh;
        this.position = position;
        this.mass = mass;
    }


    private boolean contains(E v) {
        for (E e : mass)
            if (v != null && v.equals(e)) {
                return true;
            }


        return false;
    }

    @Override
    public void add(E item) {
        if (!contains(item)) {
            mass[position++] = item;
        }

    }




    @Override
    public E get(int index) {

        return null;
    }
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {

                return mass.length>position;
            }

            @Override
            public E next() {
                if(mass.length>position) {

                    return mass[position++];
                }
                throw new NoSuchElementException();

            }

        };
    }

    Set<E> set = new HashSet<E>(Arrays.asList(mass));

}

