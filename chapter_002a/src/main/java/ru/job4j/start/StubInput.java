package ru.job4j.start;

/**
 * Created by Анна on 08.11.2017.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position =0;

    public StubInput(String[] answers, int position) {
        this.answers = answers;
        this.position = position;
    }

    @Override
    public String ask(String question) {
        return answers[position++];
    }
}
