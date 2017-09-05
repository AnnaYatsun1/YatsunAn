package ru.job4j.loop;

/**
 * Created by Анна on 02.09.2017.
 */
public class Factorial {
    public int calc(int n) {
        int result;

        if (n == 0|| n == 1)
            return 1;
        result = calc(n - 1) * n;
        return result;
    }
}

