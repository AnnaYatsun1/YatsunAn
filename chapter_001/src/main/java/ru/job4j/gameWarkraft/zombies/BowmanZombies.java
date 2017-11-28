package ru.job4j.gameWarkraft.zombies;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.elves.Elves;
import ru.job4j.gameWarkraft.intarface.Bowman;
import ru.job4j.gameWarkraft.people.People;

/**
 * Created by Анна on 22.11.2017.
 */
public class BowmanZombies extends Zombi implements Bowman {
    int lifes=100;

    public BowmanZombies(int lifes, boolean privileged) {
        super(lifes, privileged);
    }

    @Override
    public void archery(Common common) {
        int hpArchery=4;

    }

    @Override
    public void attackTheEnemy(Common common) {
        int hpArchery=2;

    }
    @Override
    public int getLife() {
        return 100;
    }
}
