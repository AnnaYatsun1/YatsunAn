package proffe;

import ru.job4j.iterator.IteratorArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Tetet {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 7, 0, -24, 0, 8, -14, 5, -100, 36, 12,11, 1};
        for (int i = 0; i < arr.length; i++) {
            if (primeNumber(arr[i]) == 1) {
                System.out.print(arr[i] );
            }

        }
    }

    private static int primeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return 0;
            }

            if ((i > Math.sqrt(number))) {
                return 1;
            }
        }
        return 0;
    }
}