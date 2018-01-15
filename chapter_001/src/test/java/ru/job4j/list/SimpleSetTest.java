package ru.job4j.list;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SimpleSetTest {
    @Test
    public void showSet(){
        Set<String> set = new HashSet<>();
        set.add("dhg");
        set.add("dhgdsgdf");
        set.add("dhgdfgd");
        for (String s :set){
            System.out.println(s+" "+s.hashCode());
        }
    }


}