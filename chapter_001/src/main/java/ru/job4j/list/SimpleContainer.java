package ru.job4j.list;

public interface SimpleContainer<E> extends Iterable<E> {
    void add(E item);
    E get(int index);
}
