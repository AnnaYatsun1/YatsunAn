package ru.job4j.gameWarkraft.elves;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.intarface.Soldier;

/**
 * Created by Анна on 22.11.2017.
 */
public class SoldierElfs extends Elves implements Soldier {
    int hpSoSoldierElfs = 15;

    public SoldierElfs(int lifes, boolean privileged) {
        super(lifes, privileged);
    }

    public String toString() {

        return "Fighters";
    }


    @Override
    public void attackWithSword(Common common) {


        if (isPrivileged() == true) {
            hpSoSoldierElfs = (int) ((int) hpSoSoldierElfs * 1.5);
            common.setLifes(common.getLifes() - hpSoSoldierElfs);

        }
        common.setLifes(common.getLifes() - hpSoSoldierElfs);
    }
    @Override
    public int getLife() {
        return 100;
    }
}

