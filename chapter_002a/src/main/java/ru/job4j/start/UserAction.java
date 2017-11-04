package ru.job4j.start;

/**
 * Created by Анна on 01.11.2017.
 */
public interface UserAction {
    int key();
    void execute(Input input, Tracker tracker);
    String info();


}
