package ru.job4j.gameWarkraft.elves;

import ru.job4j.gameWarkraft.intarface.Bowman;

/**
 * Created by Анна on 22.11.2017.
 */
public class BowmanElfs extends Elves implements Bowman {


    public BowmanElfs(int lifes, boolean privileged) {
        super(lifes, privileged);
    }

    public String toString() {
        return "Bowman";
    }

    @Override
    public void archery() {
       double  hpArchery=7;
       if(isPrivileged()==true){
           hpArchery=hpArchery*1/5;
       }


    }

    @Override
    public void attackTheEnemy() {
        double hpAttacTheEnemy=3;
        if(isPrivileged()==true){
            hpAttacTheEnemy=hpAttacTheEnemy*1/5;
        }

    }

//    @Override
//    public void archery() {
//
//        int  hpArchery=7;
//    }
//
//    @Override
//    public void attackTheEnemy() {
//
//        int hpEnemy=3;
//
//    }
}
