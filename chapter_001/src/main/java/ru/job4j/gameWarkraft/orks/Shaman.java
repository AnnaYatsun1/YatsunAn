package ru.job4j.gameWarkraft.orks;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.elves.Elves;
import ru.job4j.gameWarkraft.intarface.Mag;
import ru.job4j.gameWarkraft.people.People;

/**
 * Created by Анна on 22.11.2017.
 */
public class Shaman extends Orks implements Mag {

    public Shaman(int lifes, boolean privileged) {
        super(lifes, privileged);
    }


    @Override
    public void buf(Common common) {
        common.setPrivileged(true);

    }

    @Override
    public void magiDamage(Common common) {

    }
    @Override
    public int getLife() {
        return 100;
    }

    @Override
    public void aCurse(Common common) {
        if(common.isPrivileged()==true){
          //common.setLifes(common.isPrivileged()/1.5);
        }

    }
}