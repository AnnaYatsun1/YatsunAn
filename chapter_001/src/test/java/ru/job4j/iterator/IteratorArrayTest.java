package ru.job4j.iterator;


import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class IteratorArrayTest {
    @Test
    public void Test1forNext(){
        IteratorArray it = new IteratorArray(new int[][]{{1,2,7,8}, {3,4,5},{1}});
        int result= (int) it.next();
        assertThat(it.hasNext(),is(true));
        assertThat(result, is(1));
        result= (int) it.next();
        assertThat(it.hasNext(),is(true));
        assertThat(result, is(2));
        result= (int) it.next();
        assertThat(it.hasNext(),is(true));
        assertThat(result, is(7));
        result= (int) it.next();
        assertThat(it.hasNext(),is(true));
        assertThat(result, is(8));
        result= (int) it.next();
        assertThat(it.hasNext(),is(true));
        assertThat(result, is(3));
        result= (int) it.next();
        assertThat(it.hasNext(),is(true));
        assertThat(result, is(4));
        result= (int) it.next();
        assertThat(it.hasNext(),is(true));
        assertThat(result, is(5));
        result= (int) it.next();
        assertThat(it.hasNext(),is(false));
        assertThat(result, is(1));
    }

}