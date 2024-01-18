public class ArrayStackBottomIndexZero<T> implements Stack<T> {
    private final int DEFAULT_SIZE = 100;

    private int count = 0;

    private T[] stackArr = (T[]) new Object[DEFAULT_SIZE];

    @Override
    public void push(T item) {
        stackArr[count] = item;
        count++;
    }

    @Override
    public T peek() {
        return stackArr[count]; // this has a small issue...
    }

    @Override
    public T pop() {
        return null;
    }
}
