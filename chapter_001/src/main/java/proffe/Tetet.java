package proffe;

import ru.job4j.iterator.IteratorArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Tetet {
    public static void main(String[] args) {

        Hashtable<Integer, String> hm = new Hashtable<>();
       Integer e = 1;
       String k = "null";

        Set hashtableKeys = hm.keySet();


        hm.put(100, "Amit");
        hm.put(102, "Ravi");
        hm.put(101, "Vijay");
        hm.put(103, "Rahul");
       // hashtableKeys = hm.keySet();
        System.out.println(hashtableKeys);
        //  hashtableKeys.add(e);
        System.out.println(hashtableKeys);
        if(!hm.containsKey(e)) {
            hm.put(e, "null");
            hm.put(150, "null");
        }

        System.out.println(hashtableKeys);
        if(hm.containsKey(100)){
            hm.remove(100);
        } System.out.println(hashtableKeys);


//        for (Map.Entry m : hm.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
    }
}