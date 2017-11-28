package ru.job4j.gameWarkraft.orks;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.elves.Elves;
import ru.job4j.gameWarkraft.intarface.Soldier;
import ru.job4j.gameWarkraft.people.People;

/**
 * Created by Анна on 22.11.2017.
 */
public class SoldierOrks extends Orks implements Soldier {

    int assaultWithClub = 20;

    public SoldierOrks(int lifes, boolean privileged) {
        super(lifes, privileged);
    }


    @Override
    public void attackWithSword(Common common) {

        if (isPrivileged() == true) {
            assaultWithClub = (int) ((int) assaultWithClub * 1.5);

            common.setLifes(common.getLifes() - assaultWithClub);
        }
        common.setLifes(common.getLifes() - assaultWithClub);


    }
    @Override
    public int getLife() {
        return 100;
    }
}
