package ru.job4j.start;

import java.util.Objects;

/**
 * Created by Анна on 12.11.2017.
 */
public class ValidateInput extends ConsoleInput {

    @Override
    public String ask(String qustion, String[] range) {
        boolean invalide = true;

        String input = "";

        while (invalide) {
            input = ask(qustion);

            try {
                for (String value1 : range) {
                    Integer.valueOf(input);
                    if (Objects.equals(value1, input)) {
                        invalide = false;
                        break;
                    }
                }
                throw new MenuOutExeption("");
            } catch (MenuOutExeption msg) {
                System.out.println("Please select key from menus");
            }
        }

        return input;
    }
}
