package ru.job4j.iterator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class IteratorIntegersTest {
    @Test
    public void iteratortointeger() {
        IteratorIntegers it = new IteratorIntegers(new int[]{1, 4, 7, 8, 10, 12, 7, 5,16});
        int result = (int) it.next();
        assertThat(result, is(4));

        int result1 = (int) it.next();
        assertThat(result1, is(8));
        int result2 = (int) it.next();
        assertThat(result2, is(10));
        int result3 = (int) it.next();
        assertThat(result3, is(12));
        assertThat(it.hasNext(),is(true));
        int result4 = (int) it.next();
        assertThat(result4, is(16));




    }

}