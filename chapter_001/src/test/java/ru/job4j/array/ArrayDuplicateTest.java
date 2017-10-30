package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

import static sun.nio.cs.Surrogate.is;

/**
 * Created by Анна on 30.10.2017.
 */
public class ArrayDuplicateTest {
    @Test

    public void whenArraysDeleteDublicate() {


        String[] resultArray = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] expectArray = {"Привет", "Мир", "Супер"};
        Assert.assertThat(new ArrayDuplicate().remove(resultArray), is(expectArray));


    }


}
