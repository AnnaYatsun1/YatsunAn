package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by Анна on 30.10.2017.
 */




    public class RotateArrayTest {
        @Test
        public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
            int[][] initial = {{1, 2},{3, 4}};

            int[][] expected = {{3,1},{2,4}};
            Assert.assertThat(expected, is(new RotateArray().rotate(initial)));

            //Assert.assertThat(expected, is(RotateArray(initial)));

            //напишите здесь тест, проверяющий поворот массива размером 2 на 2.
        }

        @Test
        public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
            //напишите здесь тест, проверяющий поворот массива размером 3 на 3.
        }
    }

