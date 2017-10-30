package ru.job4j.start;

/**
 * Created by Анна on 26.09.2017.
 */
import java.util.ArrayList;
import java.util.Random;

public class Tracker {

    private Item[] items = new Item[100];
    public int position = 0;
    private static final Random RN = new Random();

    public Item add(Item item) {
        item.setId(this.generatedId());
        this.items[position] = item;
        return item;

    }

    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {

            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    String generatedId() {
        return String.valueOf(RN.nextInt());
    }

    public void update(Item item) {

        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getId().equals(item.getId())) {
                items[i]=item ;
                break;
            }
        }
    }

    public void delete(Item item) {
        Item result = null;
        for (Item item1 : items) {

            if (item != null && item.getId().equals(generatedId())) {
                result = null;
                break;
            }
        }
    }

    public Item[] findAll() {
        Item[] result = new Item[position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    public Item[] findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return (Item[]) result.toArray();
    }


//    public Item [] getAll(){
//        Item result = new Item[this.position];
//    }
}

