package ru.job4j.list;



import java.util.*;

public class TreeExample<E>implements SimpleTree    {
    Node<E> root;
    private Node parent;
    private Node children;
    List<Node<E>> node = new ArrayList<>();


    @Override
    public boolean add(Comparable parent, Comparable child) {
      if( compare(node, parent) == 0) {

          node.children.add(child);
      }
        return false;
    }

//    private boolean compare(List<Node<E>> node, Comparable parent) {
//        return  ;
//    }


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
