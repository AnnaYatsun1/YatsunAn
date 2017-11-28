package ru.job4j.gameWarkraft.elves;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.intarface.Bowman;

/**
 * Created by Анна on 22.11.2017.
 */
public class BowmanElfs extends Elves implements Bowman {
    int  hpArchery=7;
   int hpAttacTheEnemy=3;


    public BowmanElfs(int lifes, boolean privileged) {
        super(lifes, privileged);
    }

    public String toString() {
        return "Bowman";
    }

    @Override
    public void archery(Common common) {


       if(isPrivileged()==true){
           hpArchery= (int) (hpArchery*1.5);

           common.setLifes(common.getLifes() - hpArchery);
       }
        common.setLifes(common.getLifes() - hpArchery);


    }
    @Override
    public int getLife() {
        return 100;
    }

    @Override
    public void attackTheEnemy(Common common) {

        if(isPrivileged()==true){
            hpAttacTheEnemy= (int) (hpAttacTheEnemy*1.5);
            common.setLifes(common.getLifes() - hpAttacTheEnemy);
        }
        common.setLifes(common.getLifes() - hpAttacTheEnemy);

    }

}
