package ru.job4j.array;


public class RotateArray {

    int[][]  rotate(int[][] array)
    {
        int N=array.length;
        for (int i = 0; i < N /2; i++) {
                    for (int j = i; j <N-i-1 ; j++) {
                       int tempvalue1 = array[i][j];
                        array[i][j] = array[array.length - j - 1][i];

                        int tempvalue2 = array[j][array.length - i - 1];
                        array[j][array.length - i - 1] = tempvalue1;

                        tempvalue1 = array[array.length - i - 1][array.length - j
                                - 1];
                        array[array.length - i - 1][array.length - j - 1] = tempvalue2;

                        array[array.length - j - 1][i] = tempvalue1;


            }


        }

        return array;
    }


}