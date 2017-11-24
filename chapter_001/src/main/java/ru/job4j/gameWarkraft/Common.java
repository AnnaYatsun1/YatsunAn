package ru.job4j.gameWarkraft;

import ru.job4j.gameWarkraft.elves.BowmanElfs;
import ru.job4j.gameWarkraft.elves.Elves;
import ru.job4j.gameWarkraft.elves.MagElvs;
import ru.job4j.gameWarkraft.orks.Orks;
import ru.job4j.gameWarkraft.people.People;
import ru.job4j.gameWarkraft.zombies.Zombi;

/**
 * Created by Анна on 24.11.2017.
 */
public class Common  {
    public int lifes = 100;

    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }

    public boolean isPrivileged() {
        return privileged;
    }

    public void setPrivileged(boolean privileged) {
        this.privileged = privileged;
    }

    boolean privileged;

    public Common(int lifes, boolean privileged) {
        this.lifes = lifes;
        this.privileged = privileged;
    }


}
