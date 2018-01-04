package ru.job4j.iterator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
public class PrimeItTest {
    @Test
    public void ForNaturaleNumber() {
        IteratorIntegers it = new IteratorIntegers(new int[] {1, 2,  3,  8, 6, 11,7});
        int result = (int) it.next();
        assertThat(result, is(1));
        result = (int) it.next();
        assertThat(result, is(3));
//        result = (int) it.next();
//        assertThat(result, is(11));

    }


}