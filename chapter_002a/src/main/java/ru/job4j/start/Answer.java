package ru.job4j.start;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Анна on 11.11.2017.
 */
public enum Answer {


    ADD_NEW_ITEM(0),
    Show_all_items(1),
    Edit_item(2),
    Delete_item(3),
    DeleteBy_Id(4),
    Find_item_by_Id(5),
    Find_items_by_name(6),
    EXIT(7);

    private final int id;

    Answer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    private static Map<Integer, Answer> map = new HashMap<Integer, Answer>();

    static {
        for (Answer answer : Answer.values()) {
            map.put(answer.getId(), answer);
        }
    }

    public static Answer valueOf(int id) {
        return map.get(id);
    }

    public static Integer[] getIds(){
        return map.keySet().toArray(new Integer[map.size()]);
    }

}
