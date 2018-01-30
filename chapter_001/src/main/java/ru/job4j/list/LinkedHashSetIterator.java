package ru.job4j.list;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;

public class LinkedHashSetIterator<K, V> implements SimpleContainer<String> {


    @Override
    public void add(String item) {

    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    class Node<K, V> {

        private K key;
        private V value;
        private NodeForMap.Node next;

        public Node() {
        }

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public NodeForMap.Node getNext() {
            return next;
        }

        public void setNext(NodeForMap.Node next) {
            this.next = next;
        }
    }
}

