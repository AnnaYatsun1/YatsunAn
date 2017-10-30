package ru.job4j.array;


public class RotateArray {

    int[][]  rotate(int[][] array)
    {

        System.out.println("in: ");
        print(array);

        int m = array.length;


        // fill matrix
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<m; j++)
            {
                array[i][j] = m*i + j;
            }
        }

        for (int k=0; k<m/2; k++) // border -> centerjkfdhsdahf
        {
            for (int j=k; j<m-1-k; j++) // left -> right
            {
                // меняем местами 4 угла
                int tmp         = array[k][j];
                array[k][j]         = array[j][m-1-k];
                array[j][m-1-k]     = array[m-1-k][m-1-j];
                array[m-1-k][m-1-j] = array[m-1-j][k];
                array[m-1-j][k]     = tmp;
            }
        }
        System.out.println("out: ");
        print(array);
        return array;
    }

    private void print (int [] [] arr){
        for (int[] ints : arr) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
        }
        System.out.println();
    }
}