package ru.job4j.gameWarkraft.people;

import ru.job4j.gameWarkraft.intarface.Soldier;

/**
 * Created by Анна on 22.11.2017.
 */
public class SoldierPeople extends People implements Soldier {

    int lifes = 100;

    public String toString() {
        return "SoldierPeople";
    }

    @Override
    public void attackWithSword() {
        int attacOfkSword = 18;

    }
}
