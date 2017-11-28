package ru.job4j.gameWarkraft.zombies;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.intarface.Soldier;

/**
 * Created by Анна on 22.11.2017.
 */
public class SoldierZombies extends Zombi implements Soldier {
    int lifes = 100;

    public SoldierZombies(int lifes, boolean privileged) {
        super(lifes, privileged);
    }

    @Override
    public void attackWithSword(Common common) {

        int hit=18;
    }
    @Override
    public int getLife() {
        return 100;
    }
}
