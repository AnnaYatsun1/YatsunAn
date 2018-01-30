package ru.job4j.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class AssociativeHashMap<K, V> {
    private final int size = 16;
    private Node<K, V>[] arr;
    LinkedList l = new LinkedList();

    public AssociativeHashMap() {

        arr = new Node[size];
    }


    public Iterator<K> keys() {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= null){
                Node<K, V> temp1 = arr[i];
                while (temp1!=null){
                    l.addLast(temp1.getKey());
                    temp1=temp1.next;
                }

            }
        }
        return l.iterator();
    }

    public Iterator<V> values() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                Node<K, V> temp = arr[i];
                while (temp != null) {
                    l.addLast(temp.getVal());
                    temp = temp.next;
                }
            }
        }
        return l.iterator();
    }

        class Node<K, V> {

        private int index;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return Objects.equals(key, node.key);
        }

        @Override
        public int hashCode() {

            return Objects.hash(key);
        }

        protected K key;
        private V value;
        private Node<K, V> next;

        protected Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getVal() {
            return value;
        }


        private int getHashCodeForKey(K key) {
            int result = 7;
            return 31 * result + (key != null ? key.hashCode() : 0);
        }

        public V get(K key) {

            int hashcode = getHashCodeForKey(key);
            int index = hashcode % size;
            Node head = arr[index];
            while (head != null) {
                if (head.key == key) return (V) head.value;
                head = head.next;
            }
            return null;

        }

        public boolean put(K key, V value) {
            Node curr = new Node(key, value);
            int hashcode = getHashCodeForKey(key);
            int index = hashcode & size;

            if (arr[index] == null) {
                //  throw new NullPointerException("key == null");
                return false;
            } else {
                Node head = arr[index];
                curr.next = head;
                return true;
            }

        }

        public boolean delete(K key) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null && arr[i].equals(key)) {
                    arr[i] = null;
                    return true;
                }
            }
            return false;
        }


    }

}

