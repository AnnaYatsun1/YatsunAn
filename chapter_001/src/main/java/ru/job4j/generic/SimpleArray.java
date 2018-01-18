package ru.job4j.generic;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SimpleArray<T> implements Iterable<T> {
    private int index = 0;
    protected T[] objects;

    public int getIndex() {
        return index;
    }

    public SimpleArray(T[] objects) {

        this.objects = objects;
    }

    public void add(T value) {
        this.objects[index++] = value;
    }

    public T get(int position) {
        return (T) this.objects[position];
    }

    public void delete(T value, int position) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null && value.equals(objects[i])) {
                objects[i] = null;
                break;
            }

        }
    }

    public void update(T value) {
        for (int i = 0; i < objects.length; i++) {
            if (value.equals(objects[i])) {
                objects[i] = value;
                break;
            }

        }
    }

    public int indexOf(T value) {
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext()
            {
                return objects.length>index;
            }

            @Override
            public T next() {
                if(objects.length>index) {

                    return objects[index++];
                }
                throw new NoSuchElementException();

            }
        };
    }


    public Object next() {
        return objects[index++];


    }


}
