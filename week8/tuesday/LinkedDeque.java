public class LinkedDeque<E> implements Deque<E> {
    private Node head, tail;
    private int count = 0;

    // head is the front of the deque
    // tail is the back of the deque
    @Override
    public void addBack(E it) throws IllegalStateException {
        Node node = new Node();
        node.data = it;
        if (tail == null) { // could also ask head == null
            // another way of asking is the linked list empty
            tail = node;
            head = node;
            return;
        }


        // this needs to be added AFTER tail
        tail.next = node;
        node.next = null; // optional
        node.prev = tail;
        tail = node;
        // any time you make any changes
        // do a DLL
        // make sure you don't forget
        // to update both prev/next
    }

    @Override
    public void addFront(E it) throws IllegalStateException {

    }

    @Override
    public E removeFront() {
        return null;
        /*
        look a lot like pop in our linked stack
        but ... do not forget to update both pre/next
         */
    }

    @Override
    public E removeBack() {
        return null;
    }

    @Override
    public E getFront() {
        return head.data;
    }

    @Override
    public E getBack() {
        return tail.data;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int length() {
        return count;
    }

    public String toString() {
        // create an iterator... a while loop... check you reached tail

        return "look at this nice string!";
    }

    class Node {
        E data;
        Node next, prev;
    }
}
