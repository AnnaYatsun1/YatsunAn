package ru.job4j.max;

/**
 * Max.
 *
 * @author Anna Yatsun (anny0-2011@mail.ru)
 * @version $Id$
 * @since 0.1

/**
 * Created by Анна on 23.08.2017.
 */

public class Max {


    public int max(int first, int second) {


        return first > second ? first : second;


    }
    public int max(int first, int second, int third){

        //int smallest =Math.min(a, Math.min(c, b));
        return Math.max(first, Math.max(third, second));
    }

}
  