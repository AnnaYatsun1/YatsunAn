package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class TrackerTest {
    @Test
    public void whenAddItemThenGetById() {
        Tracker tr = new Tracker();
        Item item = new Item();
        item.setName("name item");
        Item rls = tr.add(item);
        System.out.println(rls.getId());
        Item find = tr.findById(rls.getId());
        System.out.println(find.getName());

        assertThat(find.getName(), is("name item"));
    }

}