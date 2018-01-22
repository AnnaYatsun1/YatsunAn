package ru.job4j.list;

class Node<T> {
    T value;
    Node<T> next;

    public Node(int i) {
    }

    boolean hasCycle(Node first) {
        first = new Node(1);
        Node two = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);

        first.next = two;
        two.next = third;
        third.next = four;
        four.next = first;
        long timer = -System.currentTimeMillis();
        long timerfinist = -System.currentTimeMillis();
        long result = timerfinist-timer;
        return true;
    }
}