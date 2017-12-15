package proffe;

import ru.job4j.iterator.IteratorArray;

import java.util.Iterator;

public class Tetet {
    private int current;
    private Object[] items;


    public Tetet(Object[] items) {
        this.current = 0;
        this.items = items;
    }

    public boolean hasNext() {
        return (current < items.length);
    }

    public  Object next() {
        return items[current++];
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {

        String[] strings = {"Bob", "Ann", "Sally", "Sue"};
        Integer[] ints = {1, 2, 3, 4, 5};
        Tetet ai = new Tetet(strings);
        while(ai.hasNext()) {
            System.out.println(ai.next());
        }
        ai = new Tetet(ints);
        while(ai.hasNext()) {
            int element=0;
            for(int x=0;x<ints.length;x++)
            {
                if(ints[x]%2==0){
                    element = ints[x];
                    System.out.println(element);
                }
            }

        }
        }
    }




