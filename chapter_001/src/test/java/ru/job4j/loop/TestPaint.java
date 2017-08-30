package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Анна on 30.08.2017.
 */
public class TestPaint {

    @Test
    public void piramid10() {
        String piramid10sample =
                "          ^\n" +
                "         ^^^\n" +
                "        ^^^^^\n" +
                "       ^^^^^^^\n" +
                "      ^^^^^^^^^\n" +
                "     ^^^^^^^^^^^\n" +
                "    ^^^^^^^^^^^^^\n" +
                "   ^^^^^^^^^^^^^^^\n" +
                "  ^^^^^^^^^^^^^^^^^\n" +
                " ^^^^^^^^^^^^^^^^^^^";

        Assert.assertEquals(piramid10sample,new Paint().piramid(10));
    }
}
