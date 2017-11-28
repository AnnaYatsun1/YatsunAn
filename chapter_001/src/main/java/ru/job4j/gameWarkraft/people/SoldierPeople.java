package ru.job4j.gameWarkraft.people;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.intarface.Soldier;

/**
 * Created by Анна on 22.11.2017.
 */
public class SoldierPeople extends People implements Soldier {
    int attacOfkSword = 18;

    public SoldierPeople(int lifes, boolean privileged) {
        super(lifes, privileged);
    }

    public String toString() {
        return "SoldierPeople";
    }

    @Override
    public void attackWithSword(Common common) {

        if (isPrivileged() == true) {
            attacOfkSword= (int) ((int) attacOfkSword * 1.5);
            common.setLifes(common.getLifes() - attacOfkSword);

        }
        common.setLifes(common.getLifes() - attacOfkSword);
    }
    @Override
    public int getLife() {
        return 100;
    }

    }

