package ru.job4j.max;


/**
 * Created by Анна on 23.08.2017.
 */
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxTest {
    @Test
  public   void bracketsValidationInStringTest1() throws BracketsValidationError {
        String str = "dsfsdf(fdsfdsf(gfdgd)fsdfds)fdfgfd9(fgd)gdfggdfg(gffdgd)";

        Assertions.assertEquals(BracketsValidationTask.bracketsValidationInString(str), Constants.BRACKETS_VALIDATION_SUCCESS_TEXT);
    }


    @Test
  public   void bracketsValidationInStringTest2() throws BracketsValidationError {
        String str = "dsfsdf((fdsfdsfgfdgd)fsdfds)fdfgfd9(fgd)gdfggdfg(gffdgd){";

        assertThrows(BracketsValidationError.class, () -> {
            BracketsValidationTask.bracketsValidationInString(str);
        });
    }
}

