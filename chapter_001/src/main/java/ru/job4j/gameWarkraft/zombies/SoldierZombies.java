package ru.job4j.gameWarkraft.zombies;

import ru.job4j.gameWarkraft.intarface.Soldier;

/**
 * Created by Анна on 22.11.2017.
 */
public class SoldierZombies extends Zombi implements Soldier {
    int lifes = 100;
    @Override
    public void attackWithSword() {
        int hit=18;
    }
}
