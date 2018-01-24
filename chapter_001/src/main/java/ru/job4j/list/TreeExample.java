package ru.job4j.list;



import java.util.*;

public class TreeExample<E, E1>implements SimpleTree    {
    Node<E> root;
    private Node parent;
    private Node children;
    List<Node<E>> node = new ArrayList<>();


    @Override
    public boolean add(Comparable parent, Comparable child) {
        return  true;
//        Node<T1, T2> x = root, y = null;
//        while (x != null) {
//            int cmp = parent.compareTo(x.key);
//            if (cmp == 0) {
//                x.value = child;
//                return;
//            } else {
//                y = x;
//                if (cmp < 0) {
//                    x = x.left;
//                } else {
//                    x = x.right;
//                }
//            }
//        }
//        Node<T1, T2> newNode = new Node<T1, T2>(parent, child);
//        if (y == null) {
//            root = newNode;
//        } else {
//            if (parent.compareTo(y.key) < 0) {
//                y.left = newNode;
//            } else {
//                y.right = newNode;
//            }
//        }
    }

    @Override
    public Optional<Node<E>> findBy(Comparable value) {
        Optional<Node<E>> rsl = Optional.empty();
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(this.root);
        while (!data.isEmpty()) {
            Node<E> el = data.poll();
            if (el.eqValue((E) value)) {
                rsl = Optional.of(el);
                break;
            }
            for (Node<E> child : el.leaves()) {
                data.offer(child);
            }
        }
        return rsl;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
//    class MyNameComp implements Comparator<Empl>{
//
//        @Override
//        public int compare(Empl e1, Empl e2) {
//            return e1.getName().compareTo(e2.getName());
//        }
//    }
    public class Node<E> {
        private final List<Node<E>> children = new ArrayList<>();
        private final E value;

        public Node(final E value) {
            this.value = value;
        }

        public void add(Node<E> child) {
            this.children.add(child);
        }

        public List<Node<E>> leaves() {
            return this.children;
        }

        public boolean eqValue(E that) {
            return this.value.equals(that);
        }
    }

}
