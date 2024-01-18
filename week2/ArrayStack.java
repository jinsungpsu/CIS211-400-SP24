public class ArrayStack<T> implements Stack<T> {
    /*
    Type parameters:
    K - key
    V - value
    E - element
    T - type
     */
    private final int DEFAULT_SIZE = 100;

    private T[] stackArr = (T[]) new Object[DEFAULT_SIZE];

    @Override
    public void push(T item) {
        // first shift EVERYTHING over to the right one spot
        // then... we'll have one open spot at index 0
        // "push" the new item to index 0

    }

    @Override
    public T peek() {
        return stackArr[0];
    }

    @Override
    public T pop() {
        T topItem = stackArr[0];
        // shift everything over to the left one spot...
        // so that the "new" top is in index 0
        return topItem;
    }
}
