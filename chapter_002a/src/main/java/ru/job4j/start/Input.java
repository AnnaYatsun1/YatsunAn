package ru.job4j.start;

/**
 * Created by Анна on 14.10.2017.
 */
public interface Input {
    String ask(String question);
    String ask(String qustion, String[] vars) ;
}
