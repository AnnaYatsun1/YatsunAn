package proffe;

import ru.job4j.iterator.IteratorArray;

import java.util.Iterator;

public class Tetet {
    public static void main(String[] args) {
    final int[][] value= new int[][]{{1,2,7,8}, {1}};
    int position = 0;
    int position2 = 0;
       if (position<= value[position2].length) {
           value[position][0] = value[position++][0];
       }
      else
       {
           value[0][position2] = value[0][position2++];



    }
        System.out.println(position+"   "+value[position][position2]);

}
}




