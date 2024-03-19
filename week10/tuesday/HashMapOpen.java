import java.util.LinkedList;

public class HashMapOpen<K, V> implements Map<K, V> {
    // separate chaining
    // open hashing
    // means array of linked lists linked lists!
    // for this assignment
    // feel free to use java.util.LinkedList
    private final int DEFAULT_SIZE = 3;
    private LinkedList<Entry>[] table = new LinkedList[DEFAULT_SIZE];
    private int count = 0;
    // make sure you increment/decrement in put/remove

    private int hash(K key) {
        // don't do this for your hw
        // b/c you should research/come up with your own
        int hashCode = Math.abs(key.hashCode());
        return hashCode%table.length;
    }

    @Override
    public V get(K key) {
        /*
        calculate the hash value
        check what you find there...???
        what do we find there?  a ref to a linked list
        if (table[hashVal] == null) {
            there's nothing there
            return null;
        } else {
            // there's a linked list there...
            // still not guaranteed that the key exists
            // so look for the key
            // and return the value IF the key exists
            // otherwise return null
         */
        return null;
    }

    @Override
    public V put(K key, V value) {
        /*
        hash function
        put it in?
        maybe check if there's something there - aka, collision???
         */
        int hashVal = hash(key);
        if (table[hashVal] == null) {
            // it's an empty spot!
            table[hashVal] = new LinkedList<>();
            Entry entry = new Entry();
            entry.key = key;
            entry.value = value;
            table[hashVal].add(entry);
        } else {
            // there's something already there
            // a collision has occurred
            // table[hashVal] != null <---- signals a collision
            // since there's something already there
            // what do i do next???
            // according to the interface...
            // if the key is already in the map what happens?
            // make a new assocation and return the existing value
            // if it's not already there, just add it and return null
            // check if it already exists...
            // collision doesn't mean the key already exists

            /*
            map.put("Hola", "hello");
            this returns null, b/c there was no previous association

            map.put("Hola", "Hi");
            this returns "hello" and replaces "hello" with "hi"
             */
            // figure out if it exists
            // index will be -1 if it doesn't exit
            int index = table[hashVal].indexOf(key);
            if (index == -1) {
                Entry entry = new Entry();
                entry.key = key;
                entry.value = value;
                table[hashVal].add(entry);
                return null;
            } else {
                // it existed, so we need to get the current value
                V currValue = table[hashVal].get(index).value;
                Entry entry = new Entry();
                entry.key = key;
                entry.value = value;
                table[hashVal].set(index, entry);
                return currValue;
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        /*
        calculate hash value
        see if the linked list exists
        if it exists... look for the key
        if key exists, then remove it!
        java.util.LinkedList class has a remove method...
        https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

         */
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

    class Entry {
        K key;
        V value;
    }
}
