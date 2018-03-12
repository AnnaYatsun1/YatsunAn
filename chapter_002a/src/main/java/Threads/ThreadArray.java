package Threads;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

import static sun.plugin2.os.windows.OSVERSIONINFOA.size;

public class ThreadArray<E> {
    int INIT_SIZE = 10;
    private Object[] array = (E[]) new Object[INIT_SIZE];
    private int pointer = 0;
    private int modCount;
    private int lastRet;

    public synchronized void add(final E item) {
        if (pointer == array.length - 1)
            resize(array.length * 2);
        array[pointer++] = item;
        System.out.println("ДОбавляем айтем" +Thread.currentThread().getName());

    }

    private synchronized void resize(int newLength) {
        E[] newArray = (E[]) new Object[newLength];
        array = Arrays.copyOf(newArray, newLength);
    }


    public E get(int index) {
        System.out.println("Берем айтем по индексу" +Thread.currentThread().getName());
        return (E) array[index];
    }


    public synchronized Iterator<E> iterator() {

        return new Iterator<E>() {


            //  int cursor = 0;
            int lastRet = -1;

            private int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                return pointer != size();
            }


            public E next() {
                if (modCount != expectedModCount) {
                    throw new ConcurrentModificationException();
                }
                return (E) array[pointer++];
            }


            final void checkForComodification() {
                if (modCount != expectedModCount)
                    throw new ConcurrentModificationException();
            }
        };


    }

    public static void main(String[] args) {
        final ThreadArray classForThread = new ThreadArray();
        int item = 0;
        Thread thread1= new Thread() {
            @Override
            public void run() {
                classForThread.add(item);
                classForThread.get(0);
            }
        };
        Thread thread2= new Thread() {
            @Override
            public void run() {
                classForThread.add(item);
                classForThread.get(0);
            }
        };
        thread1.start();
        thread2.start();
    }
}