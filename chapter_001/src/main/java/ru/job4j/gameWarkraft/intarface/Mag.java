package ru.job4j.gameWarkraft.intarface;

import ru.job4j.gameWarkraft.Common;

/**
 * Created by Анна on 22.11.2017.
 */
public interface Mag {

    public void buf(Common common) ;
    public int getLife();
    public void magiDamage(Common common);
    public void aCurse(Common common);
}
