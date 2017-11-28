package ru.job4j.gameWarkraft;

import ru.job4j.gameWarkraft.intarface.Bowman;
import ru.job4j.gameWarkraft.intarface.Mag;
import ru.job4j.gameWarkraft.intarface.Soldier;
import ru.job4j.gameWarkraft.people.People;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Анна on 23.11.2017.
 */
public class Squad<T> {
    private T t;
    List< Mag> magList = new ArrayList<>();
    List< Bowman> bowmanList = new ArrayList<>();
    List< Soldier> soldierList = new ArrayList<>();
    List<People> peopleList = new ArrayList<>();
    public <T extends People> void add(T mag, T bowman, T soldier){

        peopleList.add(mag);
        peopleList.add(bowman);
        peopleList.add(soldier);
    }


    public <T extends Mag> void add(T mag){

        magList.add(mag);
    }
    public <T extends Bowman> void add(T bowman){

        bowmanList.add(bowman);
    }
    public <T extends Soldier> void add(T soldier){

        soldierList.add(soldier);


    }


}



