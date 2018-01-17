package ru.job4j.list;

import ru.job4j.collectiosss.SortUser;

import java.util.*;

public class SimpleSet implements SimpleContainer<String> {
   private int position=0;
   private LinkedList<String> al = new LinkedList<>();


    @Override
    public void add(String item) {
        if(al.contains(item)) {
            al.add(item);
        }
        else
            System.out.println("Данный елемент уже существует ");

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
              return al.size()>position;
            }

            @Override
            public String next() {
                for (int i = position; i < al.size(); i++) {
                    position=i+1;
                    return al.get(position);

                }

                throw  new NoSuchElementException();
            }
        };
    }

    Set<String> set = new HashSet<>(al);


}

