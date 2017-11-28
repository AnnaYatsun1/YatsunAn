package ru.job4j.gameWarkraft.elves;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.intarface.*;
import ru.job4j.gameWarkraft.orks.Orks;

/**
 * Created by Анна on 22.11.2017.
 */
public class MagElvs extends Elves implements Mag {
    int hpHitMagElvs = 10;

    public MagElvs(int lifes, boolean privileged) {
        super(lifes, privileged);
    }


    public String toString() {
        return "Mag";
    }

    @Override
    public void buf(Common common) {
        common.setPrivileged(true);

    }

    @Override
    public void magiDamage(Common common) {
      //  int remainder;
        if (isPrivileged() == true) {
            hpHitMagElvs = (int) ((int) hpHitMagElvs * 1.5);
           common.setLifes(common.getLifes()-hpHitMagElvs);

        }
        common.setLifes(common.getLifes()-hpHitMagElvs);
    }

    @Override
    public void aCurse(Common commo) {

    }
    @Override
    public int getLife() {
        return 100;
    }


}
