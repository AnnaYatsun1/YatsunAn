package ru.job4j.list;

import java.util.*;

import java.util.Arrays;

public class NodeForLinked<E>  {


    static class  Node<K,V>{

        private K key;

        private NodeForMap.Node next;

        public Node(){}

        public Node(K key, V value){
            this.key = key;

        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }


        public NodeForMap.Node getNext() {
            return next;
        }

        public void setNext(NodeForMap.Node next) {
            this.next = next;
        }
    }
}