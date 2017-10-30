package ru.job4j.start;

import jdk.internal.util.xml.impl.*;

/**
 * Created by Анна on 30.10.2017.
 */
public interface UserAction {
    int key();
    void execute(Input input, Tracker tracker);
    String info();

}
