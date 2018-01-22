package ru.job4j.list;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Peiple {
    String name;
    int children;
    Calendar birthday = Calendar.getInstance();


    public Peiple(String name, int children, int month, int day, int year){
        this.name = name;
        this.children = children;
        this.birthday = birthday;
        birthday.set(Calendar.MONTH, month);
        birthday.set(Calendar.DAY_OF_MONTH, day);
        birthday.set(Calendar.YEAR, year);
    }
    public void setBirthday(int month, int day, int year, Calendar birthday) throws ParseException {
        birthday = Calendar.getInstance();
        birthday.set(Calendar.MONTH, month);
        birthday.set(Calendar.DAY_OF_MONTH, day);
        birthday.set(Calendar.YEAR, year);
        this.birthday = birthday;
    }
    public static void main(String[] args) {




        Peiple peiple = new Peiple("Ahjsdfh", 2, 5, 18, 1992);
        Peiple peiple2 = new Peiple("Ahjsdfh", 2, 12, 26, 1990);
        Map<Peiple, Object> map = new HashMap<>();
        map.put(peiple, new Object());
        map.put(peiple2, new Object());
        System.out.println(map);

    }

}
