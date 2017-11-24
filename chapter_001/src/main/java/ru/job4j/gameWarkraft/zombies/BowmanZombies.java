package ru.job4j.gameWarkraft.zombies;

import ru.job4j.gameWarkraft.elves.Elves;
import ru.job4j.gameWarkraft.intarface.Bowman;
import ru.job4j.gameWarkraft.people.People;

/**
 * Created by Анна on 22.11.2017.
 */
public class BowmanZombies extends Zombi implements Bowman {
    int lifes=100;

    @Override
    public void archery() {
        int hpArchery=4;

    }

    @Override
    public void attackTheEnemy() {
        int hpArchery=2;

    }
}
