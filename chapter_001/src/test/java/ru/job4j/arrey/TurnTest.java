package ru.job4j.arrey;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] initial = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1};

        Assert.assertThat(expected, is(Turn.back(initial)));

        //напишите здесь тест, проверяющий переворот массива с чётным числом элементов, например {2, 6, 1, 4}.
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] initial = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};

        Assert.assertThat(expected, is(Turn.back(initial)));


        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
    }
}