package ru.job4j.loop;

/**
 * Created by Анна on 02.09.2017.
 */
public class Board {
    public static String paint(int width, int height) {

        StringBuffer oddLine = new StringBuffer();
        StringBuffer evenLine = new StringBuffer();
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < width; i++) {
            oddLine.append(i % 2 == 0 ? "x" : " ");
            evenLine.append(i % 2 == 0 ? " " : "x");
        }

        for (int i = 0; i < height; i++) {
           result.append(i % 2 != 0 ? evenLine : oddLine).append(System.getProperty("line.separator"));
        }
        return result.toString();
    }

}