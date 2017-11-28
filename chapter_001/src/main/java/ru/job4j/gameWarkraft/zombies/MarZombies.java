package ru.job4j.gameWarkraft.zombies;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.elves.Elves;
import ru.job4j.gameWarkraft.intarface.Mag;
import ru.job4j.gameWarkraft.people.People;

/**
 * Created by Анна on 22.11.2017.
 */
public class MarZombies extends Zombi implements Mag {
    int lifes=100;

    public MarZombies(int lifes, boolean privileged) {
        super(lifes, privileged);
    }


    @Override
    public void buf(Common common) {

    }

    @Override
    public void magiDamage(Common common) {
        int hpAtaksNecromat=5;

    }

    @Override
    public void aCurse(Common common) {

    }
    @Override
    public int getLife() {
        return 100;
    }
}
