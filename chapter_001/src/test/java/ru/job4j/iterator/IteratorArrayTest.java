package ru.job4j.iterator;


import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class IteratorArrayTest {
    @Test
    public void Test1forNext(){
        IteratorArray it = new IteratorArray(new int[][]{{1,2,7,8}, {3,4},{5}});
        int result= (int) it.next();

        assertThat(result, is(1));
        result= (int) it.next();
        assertThat(result, is(2));
        assertThat(it.hasNext(),is(true));
        result= (int) it.next();
        assertThat(result, is(7));
        assertThat(it.hasNext(),is(true));
        result= (int) it.next();
        assertThat(result, is(8));
        assertThat(it.hasNext(),is(true));
        result= (int) it.next();
        assertThat(result, is(3));
        assertThat(it.hasNext(),is(true));
        result= (int) it.next();
        assertThat(result, is(4));
        assertThat(it.hasNext(),is(true));
        result= (int) it.next();
        assertThat(result, is(5));


    }

}