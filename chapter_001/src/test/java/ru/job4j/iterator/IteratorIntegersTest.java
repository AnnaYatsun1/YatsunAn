package ru.job4j.iterator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class IteratorIntegersTest {
    @Test
    public void iteratortointeger() {
        IteratorIntegers it = new IteratorIntegers(new int[]{16,9, 11,  2, 4, 8, 10, 7, 16, 5, 200, 15, 50});
        int result = (int) it.next();
        assertThat(result, is(16));
      result = (int) it.next();
        assertThat(result, is(2));




    }

}