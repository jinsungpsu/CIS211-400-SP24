public class LinkedStack<T> implements Stack<T> {
    private Node head;

    @Override
    public void push(T item) {
        /*
        push on the "wrong" side aka, the tail
        of the linked list
         */
//        Node itr = head;
//        while(itr.next != null) {
//            itr = itr.next;
//        }
//        itr.next = new Node();


        System.out.println("Pushing a value: " + item);
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = head;
        head = newNode;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    class Node {
        T data;
        Node next;
    }
}
