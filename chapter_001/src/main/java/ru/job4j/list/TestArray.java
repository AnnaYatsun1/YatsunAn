package ru.job4j.list;

import java.util.*;

import static sun.plugin2.os.windows.OSVERSIONINFOA.size;

class TestArray<E> implements SimpleContainer<E> {
    int INIT_SIZE =10 ;
    protected Object[] array = (E[]) new Object[INIT_SIZE];
    private int pointer = 0;
    private int modCount;
    private int  lastRet;
    private Object expectedModCount;


    @Override
    public void add(E item) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = item;

    }
    private void resize(int newLength) {
        E[] newArray = (E[]) new Object[newLength];
        array = newArray;
    }


    @Override
    public E get(int index) {
        return (E) array[index];
    }


    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {

            //  int cursor = 0;
            int lastRet = -1;

            int expectedModCount = modCount;
            @Override
            public boolean hasNext() {
                return pointer != size();
            }
            @Override
            public E next() {
                checkForComodification();
                try {
                    E next = get(pointer);
                    lastRet = pointer++;
                    return next;
                } catch (IndexOutOfBoundsException e) {
                    checkForComodification();
                    throw new NoSuchElementException();
                }
            }

            final void checkForComodification() {
                if (modCount != expectedModCount)
                    throw new ConcurrentModificationException();
            }
        };



    }
}