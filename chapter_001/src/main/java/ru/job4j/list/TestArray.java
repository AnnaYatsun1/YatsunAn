package ru.job4j.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class TestArray<E> implements Iterator<E>{
    private List<E> list = null;

    public TestArray(final int size) {
        this.list = new ArrayList<E>();
       // this.list = new Object[];

        for (int i = 0; i < size; i++) {
            list.add(null);
        }
    }

    public E get(final int index) {
        return list.get(index);
    }

    public void set(final int index, final E value) {
        list.set(index, value);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }
}
