package ru.job4j.gameWarkraft;

import ru.job4j.gameWarkraft.intarface.Bowman;
import ru.job4j.gameWarkraft.intarface.Mag;
import ru.job4j.gameWarkraft.intarface.Soldier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Анна on 23.11.2017.
 */
public class Squad<T> {
    List< Mag> list = new ArrayList<>();
    List< Bowman> list1 = new ArrayList<>();
    List< Soldier> list2 = new ArrayList<>();

    public <T extends Mag> void add(T mag){
        list.add(mag);
    }
    public <T extends Bowman> void add(T bowman){
        list1.add(bowman);
    }
    public <T extends Soldier> void add(T soldier){
        list2.add(soldier);


    }



    public Squad(T t) {
        this.t = t;
    }

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}



