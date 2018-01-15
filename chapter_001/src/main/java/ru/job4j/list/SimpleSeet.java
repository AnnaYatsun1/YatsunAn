package ru.job4j.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SimpleSeet implements SimpleContainer<String> {
    int lengh;
    int position;
    String[] mass = new String[lengh];


  @Override
    public void add(String item) {
      if(!contains(item)){
              mass[position++]=item;
            //  position++;
            }

    }


    public  boolean contains( String v) {
        for (final String e : mass)
            if (v != null && v.equals(e))
                return true;

        return false;
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
                if (lengh == mass.length) {
                    return false;
                }
                return true;
            }

            @Override
            public String next() {
                return null;
            }
        };
    }
    Set<String> set = new HashSet<String>(Arrays.asList(mass));

}

