package ru.job4j.gameWarkraft;



import ru.job4j.gameWarkraft.orks.Orks;
import ru.job4j.gameWarkraft.people.People;
import ru.job4j.gameWarkraft.zombies.Zombi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Анна on 22.11.2017.
 */
public class Game {

    public static void ramdom() {

        double a = 1 + Math.random() * 2;
        System.out.println(a);
        if (a >= 1 && a <= 2) {
            System.out.println("На арену выходит расса ельфов");
           // Elves elves = new Elves();

        }
        if (a > 2 && a <= 3) {
            System.out.println("На арену выходит расса людей");
            People people = new People();

        }
        double a1 = 1 + Math.random() * 2;
        System.out.println(a1);
        if (a1 >= 1 && a1 <= 2) {
            System.out.println("На арену выходит расса орков");
            Orks orks = new Orks();

        }
        if (a1 > 2 && a1 <= 3) {
            System.out.println("На арену выходит расса нежити ");
            Zombi zombi = new Zombi();


        }

    }
    public void fight(){


    }
}
