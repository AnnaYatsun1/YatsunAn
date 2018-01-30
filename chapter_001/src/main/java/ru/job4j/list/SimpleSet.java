package ru.job4j.list;

import proffe.Tetet;

import java.util.*;

public class SimpleSet<E> implements SimpleContainer<E> {
    Set<Node> nodes = new HashSet<Node>();
    private int position;
///

    @Override
    public void add(E item) {
        if(nodes.contains(item)) {
            nodes.add((Node) item);
        }
        else
            System.out.println("Данный елемент уже существует ");

    }



    @Override
    public E get(int index) {
        return null;
    }

    public Iterator<E> iterator() {
        ///
        return (Iterator<E>) new Iterator<Node>() {
            @Override
            public boolean hasNext() {


                return nodes.size()>position;
            }

            @Override
            public Node next() {
                while (hasNext()){
                    return (Node) nodes;
                }

                throw new NoSuchElementException();

            }

        };
    }



    static class Node {
        int row;

        public Node(int row, int col) {
            this.row = row;

        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + row;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Node other = (Node) obj;
       ;
            if (row != other.row)
                return false;
            return true;
        }
    }




  //  Set<String> set = new HashSet<>(al);


}

