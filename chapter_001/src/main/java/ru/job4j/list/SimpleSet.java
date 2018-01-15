package ru.job4j.list;

import ru.job4j.collectiosss.SortUser;

import java.util.*;

public class SimpleSet implements SimpleContainer<String> {
   private int position;
   private List<String> al = new ArrayList<String>();


    @Override
    public void add(String item) {

        boolean equals = al.get(position).equals(item);
        if (!equals ) {
            al.add(item);
        }

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
                for (int i = 0; i < al.size(); i++) {
                        return true;
                    }
                return false;
            }

            @Override
            public String next() {
                int position = 0;
                for (int i = position; i < al.size(); i++) {
                    position = i + 1;
                    return al.get(position);

                }

                return null;
            }
        };
    }

    Set<String> set = new HashSet<>(al);


}

