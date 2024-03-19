public class HashMapClosed<K, V> implements Map<K, V> {

    private final int DEFAULT_SIZE = 3;
    private K[] keys = (K[]) new Object[DEFAULT_SIZE];
    private V[] values = (V[]) new Object[DEFAULT_SIZE];

    private int count = 0;
    // make sure you increment/decrement in put/remove

    private int hash(K key) {
        // don't do this for your hw
        // b/c you should research/come up with your own
        int hashCode = Math.abs(key.hashCode());
        //return hashCode%keys.length;
        // bad hash function to test collisions
        return 2;
    }
    @Override
    public V get(K key) {
        /*
        calculate hash
        see if it exists
            check that spot in the array
            try to find key
            if it's not there
            linear probe... LOOP
            if it finishes loop without finding it
            then it doesn't exist
         */
        return null;
    }

    @Override
    public V put(K key, V value) {
        // for closed hashing... assume value doesn't exist and always return null
        /*
        calculate the hash value
        see if it exists...
            check if that spot is null
            if it's not null... i need to probe
         */
        int hashVal = hash(key);
        if (keys[hashVal]==null) {
            // no collision?
            keys[hashVal] = key;
            values[hashVal] = value;

        } else {
            // there's a collision?
            // for loop to length of array... and break if i need
            for (int i = hashVal+1; i < keys.length + hashVal; i++) {
                if (keys[i%keys.length]==null) {
                    keys[i%keys.length] = key;
                    values[i%keys.length] = value;
                    break;
                }
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        // algorithm is almost identical to get
        // if item is found... remove it...
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

}
