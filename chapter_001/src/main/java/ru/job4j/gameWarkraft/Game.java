package ru.job4j.gameWarkraft;


import ru.job4j.gameWarkraft.orks.BowmanOrks;
import ru.job4j.gameWarkraft.orks.Orks;
import ru.job4j.gameWarkraft.orks.Shaman;
import ru.job4j.gameWarkraft.orks.SoldierOrks;
import ru.job4j.gameWarkraft.people.BowmanPeople;
import ru.job4j.gameWarkraft.people.MagPeolple;
import ru.job4j.gameWarkraft.people.People;
import ru.job4j.gameWarkraft.people.SoldierPeople;

import java.util.*;

/**
 * Created by Анна on 22.11.2017.
 */
public class Game {


    public void random() {

        double a = 1 + Math.random() * 2;
        System.out.println(a);

        if (a > 2 && a <= 3) {
            System.out.println("На арену выходит расса людей");
            Squad<People> people = new Squad<>();
            people.peopleList.add(new MagPeolple(100, true));
            people.peopleList.add(new BowmanPeople(100, true));
            people.peopleList.add(new BowmanPeople(100, true));
            people.peopleList.add(new SoldierPeople(100, true));
            people.peopleList.add(new SoldierPeople(100, true));
            people.peopleList.add(new SoldierPeople(100, true));
//            people.magList.add(0, new MagPeolple(100, true));
//            people.bowmanList.add(0, new BowmanPeople(100, true));
//            people.bowmanList.add(1, new BowmanPeople(100, true));
//            people.soldierList.add(0, new SoldierPeople(100, true));
//            people.soldierList.add(1, new SoldierPeople(100, true));
//            people.soldierList.add(2, new SoldierPeople(100, true));




        }

        double a1 = 1 + Math.random() * 2;
        System.out.println(a1);
        if (a1 >= 1 && a1 <= 2) {
            System.out.println("На арену выходит расса орков");
            Squad<Orks> orks = new Squad<>();
            orks.magList.add(0, new Shaman(100, true));
            orks.bowmanList.add(0, new BowmanOrks(100, true));
            orks.bowmanList.add(1, new BowmanOrks(100, true));
            orks.soldierList.add(0, new SoldierOrks(100, true));
            orks.soldierList.add(1, new SoldierOrks(100, true));
            orks.soldierList.add(2, new SoldierOrks(100, true));


        }

    }

    public void figt( ) {
      Squad<People> people = new Squad<>();
//        Squad<Orks> orks = new Squad<>();
        int peopleLife = 0;
        int orksLife = 0;
        for (int i = 0; i <people.peopleList.size(); i++) {
            peopleLife+=people.peopleList.get(i).getLifes();
        }

//        for (int i = 0; i < people.magList.size(); i++) {
//            peopleLife += people.magList.get(i).getLife();
//        }
//        for (int i = 0; i < people.soldierList.size(); i++) {
//            peopleLife += people.soldierList.get(i).getLife();
//        }
//        for (int i = 0; i < people.bowmanList.size(); i++) {
//            peopleLife += people.bowmanList.get(i).getLife();
//        }
//        for (int i = 0; i < orks.magList.size(); i++) {
//            orksLife += orks.magList.get(i).getLife();
//        }
//        for (int i = 0; i < orks.soldierList.size(); i++) {
//            orksLife += orks.soldierList.get(i).getLife();
//        }
//        for (int i = 0; i < orks.bowmanList.size(); i++) {
//            orksLife += orks.bowmanList.get(i).getLife();
//        }


        while (peopleLife >= 0 || orksLife >= 0) {

////
//         int size= people.peopleList.size();
//         System.out.println(size);
//        int item = new Random().nextInt(size );
//            people.peopleList.get(item).at((Common) orks.soldierList.get(item1));
//            System.out.println(item);
//            int item1 = new Random().nextInt(size);
//            System.out.println(item1);
//            orks.soldierList.get(item1);
//            people.soldierList.get(item).attackWithSword((Common) orks.soldierList.get(item1));
//
//
//
//            int size3 = people.bowmanList.size();
//            int item3 = new Random().nextInt(size3);
//            orks.bowmanList.get(item3);
//            people.bowmanList.get(item3).attackTheEnemy((Common) orks.bowmanList.get(item3));
//            int size7 = people.bowmanList.size();
//            int item7 = new Random().nextInt(size7);
//            orks.bowmanList.get(item7);
//            people.bowmanList.get(item7).archery((Common) orks.soldierList.get(item3));
//            int size4 = people.magList.size();
//            int item4 = new Random().nextInt(size4);
//            orks.magList.get(item4);
//            people.magList.get(item4).magiDamage((Common) orks.magList.get(item4));
//
//            int size2 = orks.magList.size();
//            int item2 = new Random().nextInt(size2);
//            orks.magList.get(item2);
//            orks.magList.get(item2).magiDamage((Common) people.soldierList.get(item2));
//            int size5 = orks.bowmanList.size();
//            int item5 = new Random().nextInt(size5);
//            orks.bowmanList.get(item5);
//            orks.bowmanList.get(item5).attackTheEnemy((Common) people.magList.get(item5));
//            int size8 = orks.bowmanList.size();
//            int item8 = new Random().nextInt(size8);
//            orks.bowmanList.get(item8);
//            orks.bowmanList.get(item8).archery((Common) people.soldierList.get(item5));
//            int size6 = orks.soldierList.size();
//            int item6 = new Random().nextInt(size6);
//            orks.soldierList.get(item6);
//            orks.soldierList.get(item5).attackWithSword((Common) people.bowmanList.get(item6));
       }

    }

    public static void main(String[] args) {
        new Game().random();
        new Game().figt();
    }


}