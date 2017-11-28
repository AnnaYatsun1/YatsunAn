package ru.job4j.gameWarkraft.orks;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.intarface.Bowman;

/**
 * Created by Анна on 22.11.2017.
 */
public class BowmanOrks extends Orks implements Bowman {
    int lifes = 100;
    int archery = 3;
    int punch = 2;


    public BowmanOrks(int lifes, boolean privileged) {
        super(lifes, privileged);
    }




    @Override
    public void archery(Common common) {

        if (isPrivileged() == true) {
            archery = (int) ((int) archery * 1.5);
            common.setLifes(common.getLifes() - archery);
        }
        common.setLifes(common.getLifes() - archery);

    }

    @Override
    public int getLife() {
        return 100;
    }

    @Override
    public void attackTheEnemy(Common common) {

        if (isPrivileged() == true) {
            punch = (int) ((int) punch * 1.5);

            common.setLifes(common.getLifes() - punch);
        }
        common.setLifes(common.getLifes() - punch);
    }
}