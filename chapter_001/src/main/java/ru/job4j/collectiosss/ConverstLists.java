package ru.job4j.collectiosss;

import ru.job4j.loop.I;

import java.util.*;

/**
 * Created by Анна on 29.11.2017.
 */
public class ConverstLists {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> list = new ArrayList<>();
        int rows = 7;
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
      //  list.add(6);
        toList(array);
        toArray(list, rows);

    }

    public static List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        //  list =null;
        try {
            for (int i = 0; i < array.length; i++)
                for (int j = 0; j < array[i].length; j++)
                    list.add(array[i][j]);
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static int[][] toArray(List<Integer> list, int rows) {
        int[][] result = new int[list.size()][rows];
        int counter = 0;
        for (Integer value : list) {
            result[counter / rows][counter % rows] = value;
            counter++;

        }
        System.out.println(Arrays.asList(result));
        return result;
    }
}
