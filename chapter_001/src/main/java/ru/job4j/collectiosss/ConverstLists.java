package ru.job4j.collectiosss;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Анна on 29.11.2017.
 */
public class ConverstLists {
    public static void main(String[] args) {
        int n=3;
        int[][] array = new int[n][n];
        Random random = new Random();
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]= (int) (Math.random()*10);
            }

            for (int j = 0; j < array.length; j++,System.out.println()); {
                for (int k = 0; k < array[i].length; k++) {
                    System.out.println(array[i][k]+ " ");
                    
                }

                
            }}
    }
}