package ru.job4j.max;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.job4j.max.BracketsValidationError;
import ru.job4j.max.BracketsValidationTask;
import ru.job4j.max.Constants;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class BracketsValidationTest {
    @Test
    void bracketsValidationInStringTest1() throws BracketsValidationError {
        String str = "dsfsdf{fdsfdsf(gfdgd)fsdfds}fdfgfd9(fgd)gdfggdfg{gffdgd}";

        Assertions.assertEquals(BracketsValidationTask.bracketsValidationInString(str), Constants.BRACKETS_VALIDATION_SUCCESS_TEXT);
    }


    @Test
    void bracketsValidationInStringTest2() throws BracketsValidationError {
        String str = "dsfsdf((fdsfdsfgfdgd)fsdfds)fdfgfd9(fgd)gdfggdfg(gffdgd){";

        assertThrows(BracketsValidationError.class, () -> {
            BracketsValidationTask.bracketsValidationInString(str);
        });
    }

}