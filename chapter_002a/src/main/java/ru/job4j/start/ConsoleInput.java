package ru.job4j.start;

import java.util.Scanner;

/**
 * Created by Анна on 13.10.2017.
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.next() ;
    }
    public String askName(String question) {
        System.out.println(question);
        return scanner.next() ;
    }
    public String askId(String question) {
        System.out.println(question);
        return scanner.next() ;
    }
}
