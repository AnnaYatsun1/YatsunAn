package ru.job4j.gameWarkraft.elves;

import ru.job4j.gameWarkraft.intarface.Soldier;

/**
 * Created by Анна on 22.11.2017.
 */
public class SoldierElfs extends Elves  implements Soldier {

    public SoldierElfs(int lifes, boolean privileged) {
        super(lifes, privileged);
    }

    public String toString() {

        return "Fighters" ;
    }




    @Override
    public void attackWithSword() {
         double hpSoSoldierElfs=15;
       if(isPrivileged()==true){
       hpSoSoldierElfs=hpSoSoldierElfs*1/5;
    }
    }
}
