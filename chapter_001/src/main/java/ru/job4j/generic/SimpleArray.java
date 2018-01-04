package ru.job4j.generic;

import java.util.ArrayList;
import java.util.List;

public class SimpleArray<T > {
    int index = 0;
    Object[] objects;

    public int getIndex() {
        return index;
    }

    public SimpleArray(Object[] objects) {
        this.objects = objects;
    }

    public void add(T value) {
        this.objects[index++] = value;
    }

    public T get(int position) {
        return (T) this.objects[position];
    }

    public void delete(T value) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] != null && value.equals(objects[i])) {
                objects[i] = null;
                break;
            }

        }
    }

    public void update(T value) {
        for (int i = 0; i <objects.length; i++) {
            if(value.equals(objects[i])){
                objects[i]=value;
                break;
            }

        }
    }
}
