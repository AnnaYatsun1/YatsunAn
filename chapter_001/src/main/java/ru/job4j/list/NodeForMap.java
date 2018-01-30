package ru.job4j.list;

public class NodeForMap<K,V> {
    private int BUCKET_ARRAY_SIZE = 16;
    private Node bucketArray[] = new Node[BUCKET_ARRAY_SIZE];
    private int count;

    /* Constructors */
    public NodeForMap() {
    }

    public NodeForMap(int initialSize) {
        this.BUCKET_ARRAY_SIZE = initialSize;
    }

    public void insert(K key, V value) {

        int hash = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE);

        Node entry = new Node(key, value);
        if (bucketArray[hash] == null) {

            bucketArray[hash] = entry;
        } else {

            Node current = bucketArray[hash];
            while (current.next != null) {
                if (current.getKey().equals(entry.getKey())) {
                    current.setValue(entry.getValue());
                    return;
                }
                current = current.next;
            }

            current.next = entry;
        }
    }
//
    public V get(K key) {
        int hash = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE);
        Node n = bucketArray[hash];
        while (n != null) {
            if (n.getKey().equals(key)) {
                 return (V) n.getValue();
            }
            n = n.getNext();
        }
        return null;
    }
//
    public boolean delete (K key) {
        int bucket = hash(key);

        if (bucketArray[bucket].key.equals(key)) {
            bucketArray[bucket] = bucketArray[bucket].next;
            count--;
            return true;
        }
        else return false;
    }
    private int hash(Object key) {

        return (Math.abs(key.hashCode())) % bucketArray.length;
    }

    static class  Node<K,V>{

    private K key;
    private V value;
    private Node next;

    public Node(){}

    public Node(K key, V value){
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

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
}

