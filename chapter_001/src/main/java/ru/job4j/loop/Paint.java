package ru.job4j.loop;

/**
 * Created by Анна on 30.08.2017.
 */
public class Paint {
    public String piramid(int h) {

        StringBuilder piramid = new StringBuilder();

        for (int i = 0; i < h; i++) {

            for (int j = 0; j < h - i; j++) {
                piramid.append(" ");
            }

            for (int j = 0; j < i * 2 + 1; j++) {
                piramid.append("^");
            }

            if (i != h - 1) piramid.append("\n");
        }

        return piramid.toString();
    }

}

