package ru.job4j.gameWarkraft.elves;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.intarface.*;

/**
 * Created by Анна on 22.11.2017.
 */
public class MagElvs extends Elves  implements Mag {
//    int lifes = 100;
//    boolean privileged;

    public MagElvs(int lifes, boolean privileged) {
        super(lifes, privileged);
    }


    public String toString() {
        return "Mag" ;
    }

    @Override
    public void buf(Common common) {
        common.setPrivileged(true);

    }

    @Override
    public void magiDamage() {
       double hpHitMagElvs =10;
       if(isPrivileged()==true){
           hpHitMagElvs= hpHitMagElvs*1.5;
       }
    }

    @Override
    public void aCurse() {

    }


}
