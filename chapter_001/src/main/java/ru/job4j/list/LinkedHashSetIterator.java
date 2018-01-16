package ru.job4j.list;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;

public class LinkedHashSetIterator implements SimpleContainer<String> {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();

    @Override
    public void add(String item) {

        linkedHashSet.add(item);


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
                for (int i = 0; i < linkedHashSet.size(); i++) {
                    return true;

                }
                return false;
            }

            @Override
            public String next() {
                if(hasNext()){
                    return String.valueOf(linkedHashSet);
                }

                throw new NoSuchElementException();
            }
        };
    }

}

