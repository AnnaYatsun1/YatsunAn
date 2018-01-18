package ru.job4j.list;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class ExmpleHashTable<E> {

    Hashtable<E , String> hm = new Hashtable<>();
    String a =" ";
    E b;
    public void put() {
        hm.put(b, a);

    }
//        hm.put(102, "Ravi");
//        hm.put(101, "Vijay");
//        hm.put(103, "Rahul");
//        System.out.println(hm);


    public boolean add(E o) {
        if (!hm.containsKey(o)){
            hm.put(o, " ");
            return true;
        }
        else
            return false;

    }

    private boolean contains(E v) {
        return hm.containsKey(v);


    }


    public boolean remove(E o) {
        if (hm.containsKey(o)) {
            hm.remove(o);
            return true;
        }
        return false;
    }
    Set hashtableKeys = hm.keySet();
}