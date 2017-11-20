package ru.job4j.start;

/**
 * Created by Анна on 08.11.2017.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;

    }

    @Override
    public String ask(String question) {
        return answers[position++];
    }



    public  String ask(String qustion, String[] vars){
        //return String.valueOf(-1);
        throw new UnsupportedOperationException("Unsuport operation");
    }
}
