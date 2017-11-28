package ru.job4j.gameWarkraft;

import ru.job4j.gameWarkraft.elves.BowmanElfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Анна on 24.11.2017.
 */
public class Team {
    List<Common> heros = new ArrayList<>();
    Team enemys;
    public  boolean isLife(){
        return true;
    }
    public  void enemy(Team team){
        this.enemys=team;

    }
    public  void  move(){
      Common hero = heros.get(new Random().nextInt(heros.size()-1));
      Common enemy = enemys.heros.get(new Random().nextInt(heros.size()-1));
       int hit =hero.damage();
       enemy.setLifes(enemy.getLifes()-hit);

    }

    public void add(Common hero) {
        heros.add(hero);
    }
}
