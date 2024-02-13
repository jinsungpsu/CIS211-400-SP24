public class CircularLinkedStack<T> implements Stack<T> {
    private Node head;
    private int count = 0, nodes = 0;

    @Override
    public void push(T item) throws IllegalStateException {
        if (nodes == 0) {
            head = new Node(item, null);
            head.next = head;
            nodes++;
        } else if (nodes > count){
            // there's space, don't create a node
            Node tail = getTail();
            tail.data = item;
            head = tail;
        } else {
            // there's no more space
            // let's create a node
            Node node = new Node(item, head);
            getTail().next = node;
            node.next = head;
            head = node;
            nodes++;
        }
        count++;
    }

    private Node getTail() {
        Node itr = head;
        for (int i = 0; i < nodes-1; i++) {
            itr = itr.next;
        }
        return itr;
    }

    @Override
    public T pop() {
        if (count==0) {
            return null;
        } else {
            T returnData = head.data;
            head.data = null;
            head = head.next;
            count--;
            return returnData;
        }
    }

    @Override
    public T peek() {
        if (count==0) return null;
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        return count==0;
    }

    @Override
    public int length() {
        return count;
    }

    public String toString() {
        if (head == null) return "empty stack";
        String o ="";
        Node itr = head;
        for (int i = 0; i < count; i++) {
            o+= itr.data + " ";
            itr = itr.next;
        }
        return o;
    }

    class Node {
        T data;
        Node next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
