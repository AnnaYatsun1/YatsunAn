package ru.job4j.start;

/**
 * Created by Анна on 11.11.2017.
 */
public abstract class BaseAction implements UserAction {
    int key;

    String name;

    //String info();

   // void execute(Input input, Tracker tracker);

    public BaseAction(int key, String name) {
        this.key = key;
        this.name = name;
    }

}
