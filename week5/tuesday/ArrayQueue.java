public class ArrayQueue<T> implements Queue<T> {
    private final int DEFAULT_SIZE = 5;
    private T[] queueContents = (T[])(new Object[DEFAULT_SIZE]);
    private int front=0, back=0;
    // front... right... (bathroom is higher index)
    // back is left...
    private int count=0;

    @Override
    public void enqueue(T it) throws IllegalStateException {
        // enqueue ... add to the "back"... which is left...
        queueContents[back] = it;
        back--; // this will go to -1 after adding one
        // add some code here to make back go to the "right" of the array
    }

    @Override
    public T dequeue() {
        T frontItem =   queueContents[front];
        front--;
        // but still needs some logic for circularity when
        // that situation occurs
        return frontItem;
    }

    @Override
    public T frontValue() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }
}
