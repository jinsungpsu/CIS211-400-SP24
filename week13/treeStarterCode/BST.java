public class BST<K extends Comparable<K>, V> implements Map<K, V> {
    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    class Node {
        Node left, right;
        K key;
        V value;
    }
}
