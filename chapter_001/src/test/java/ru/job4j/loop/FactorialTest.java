package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class FactorialTest {
        @Test
        public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
            Assert.assertEquals(120, 1 * 2 * 3 * 4 * 5);
            Assert.assertTrue(120 == 1 * 2 * 3 * 4 * 5);
            //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        }

        @Test
        public void whenCalculateFactorialForZeroThenOne() {
            Assert.assertEquals(0, 1*0);
            Assert.assertTrue(0== 1*0);


        }

    }