package ru.job4j.list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetIterator implements SimpleContainer<String> {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();

    @Override
    public void add(String item) {
        if(!isExist(item)){
               linkedHashSet.add(item);
          }

    }
    public boolean isExist (String item){

        if(linkedHashSet.contains(item)){
            return true;
        }
        else return false;
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
                    for (int i = 0; i < linkedHashSet.size(); i++) {

                   return String.valueOf(linkedHashSet);


                    }

                    return null;
                }
            };
        }

}

