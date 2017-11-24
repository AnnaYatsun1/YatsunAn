package ru.job4j.gameWarkraft.people;

import ru.job4j.gameWarkraft.intarface.Bowman;

/**
 * Created by Анна on 22.11.2017.
 */
public class BowmanPeople extends People implements Bowman {//арбалетчик
    public String toString() {
        return "BowmanPeople" ;
    }
    int lifes=100;

    @Override
    public void archery() {

    }

    @Override
    public void attackTheEnemy() {

    }
}
