package ru.job4j.gameWarkraft.people;

import com.sun.org.apache.xpath.internal.operations.Or;
import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.intarface.Mag;


/**
 * Created by Анна on 22.11.2017.
 */
public class MagPeolple extends People implements Mag {
    int ataksMageck = 4;
    public String toString() {
        return "MagPeople" ;
    }

    public MagPeolple(int lifes, boolean privileged) {
        super(lifes, privileged);
    }

    @Override
    public void buf(Common common) {
        common.setPrivileged(true);

    }

    @Override
    public void magiDamage(Common common) {


        if (isPrivileged() == true) {
            ataksMageck = (int) ((int) ataksMageck * 1.5);
            common.setLifes(common.getLifes()-ataksMageck);

        }
        common.setLifes(common.getLifes()-ataksMageck);
    }

    @Override
    public void aCurse(Common common) {

    }
    @Override
    public int getLife() {
        return 100;
    }

}
