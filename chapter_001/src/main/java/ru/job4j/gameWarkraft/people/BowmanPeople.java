package ru.job4j.gameWarkraft.people;

import ru.job4j.gameWarkraft.Common;
import ru.job4j.gameWarkraft.intarface.Bowman;

/**
 * Created by Анна on 22.11.2017.
 */
public class BowmanPeople extends People implements Bowman {
    public BowmanPeople(int lifes, boolean privileged) {
        super(lifes, privileged);
    }//арбалетчик
    public String toString() {
        return "BowmanPeople" ;
    }
    int archery=5;
    int attackTheEnemy=3;

    @Override
    public void archery(Common common) {
        if(isPrivileged()==true){
            archery= (int) (archery*1.5);

            common.setLifes(common.getLifes() -archery);
        }
        common.setLifes(common.getLifes() -archery);
    }

    @Override
    public void attackTheEnemy(Common common) {
        if(isPrivileged()==true){
            attackTheEnemy= (int) (attackTheEnemy*1.5);
            common.setLifes(common.getLifes() - attackTheEnemy);
        }
        common.setLifes(common.getLifes() - attackTheEnemy);

    }
    @Override
    public int getLife() {
        return 100;
    }
}
