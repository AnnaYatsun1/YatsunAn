package ru.job4j.gameWarkraft.people;

import com.sun.org.apache.xpath.internal.operations.Or;
import ru.job4j.gameWarkraft.intarface.Mag;


/**
 * Created by Анна on 22.11.2017.
 */
public class MagPeolple extends People implements Mag {
    int life = 100;

    @Override
    public void buf() {

    }

    @Override
    public void magiDamage() {
        int ataksMageck = 4;
    }

    @Override
    public void aCurse() {

    }


}
