package ru.job4j.list;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class ExmpleHashTable<E, T> {

        Hashtable<E, T> hm = new Hashtable<>();
        T a ;
        E b;
    Set hashtableKeys = hm.keySet();
    public void put() {
        hm.put(b, a);

    }

//        hm.put(100, "Amit");
//        hm.put(102, "Ravi");
//        hm.put(101, "Vijay");
//        hm.put(103, "Rahul");
//        System.out.println(hm);


//        for (Map.Entry m : hm.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//        }

    public boolean add(E o) {

        if (!hashtableKeys.contains(o)) {
            hashtableKeys.add(o);
            return true;
        } else
         return false;
    }

private boolean contains(Integer v, Set hashtableKeys ) {
    return hashtableKeys.contains(v);


}
//

//    public boolean remove(Object o) {
//        return false;
//    }
}