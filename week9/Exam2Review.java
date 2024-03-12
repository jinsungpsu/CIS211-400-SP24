
public class Main {
    public static void main(String[] args) {
//        ArrayQueue<Integer> q = new ArrayQueue<>();
//        q.enqueue(1);
//        q.enqueue(2);
//        q.enqueue(3);
//        System.out.println(q);
//        System.out.println("Dequeing" + q.dequeue());
//        System.out.println("Dequeing" + q.dequeue());
//        q.enqueue(4);
//        q.enqueue(5);
//        System.out.println(q);

        LinkedDeque<String> dq = new LinkedDeque<>();
        dq.addFront("one");
        dq.addFront("two");
        dq.addFront("three");
        dq.addFront("four");
        System.out.println(dq);
        System.out.println("Get front: " + dq.getFront());
        //System.out.println("Get back: " + dq.getBack());
        System.out.println("Removing back " + dq.removeBack());
        System.out.println("Removing front " + dq.removeFront());
        System.out.println(dq);
    }
}

class ArrayQueue<T> {
    private final int DEFAULT_SIZE = 3;
    private T[] queue = (T[])(new Object[DEFAULT_SIZE]);
    private int count = 0, front = 0, back = 0;
    // front of array is towards "0" or left unless it circles..

    public void enqueue(T item) {
        if (count > queue.length) {
            // array is full
        } else {
            queue[back % queue.length] = item;
            back++;
            count++;
        }
    }

    public T dequeue() {
        /*
        if array empty
        return null
        save the front item to a temp var
        increment front (to update the index of the current front item)
        decrement count
         */
        if (count == 0) {
            return null;
        } else {
            T returnThing = queue[front];
            queue[front] = null; // not necessary
            front++;
            count--;
            return returnThing;
        }
    }

    public T getFront() {
        return queue[front-1%queue.length];
    }

    public String toString() {
        /*
        for loop
         */
        String o = "";
        for (int i = 0; i < count; i++) {
            o += queue[(i+front)% queue.length];
        }
        return o;
    }
}

class LinkedDeque<T> {

    private Node head, tail;
    private int count = 0;
    public void addFront(T item) {
        /*
        Make a node
        append the node
            --
        increment count
         */

        Node node = new Node();
        node.data = item;
        node.next = head;
        if (head != null) {
            head.prev = node;
        } else {
            tail = node;
        }
        head = node;
        count++;

    }
    public void addBack(T item) {

    }

    public T removeFront() {
        return null;
    }

    public T removeBack(){
        Node tempTail = tail;
        tail = tail.prev;
        tempTail.prev = null; // optional
        tail.next = null;
        count--;
        return tempTail.data;
    }

    public T getFront() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public T getBack() {
        return null;
    }

    public String toString() {
        /*
        a while loop
        need an iterator...
        while itr.next != null
         */
        String o = "";
        Node itr = head;
        while (itr != null) {
            o += itr.data;
            itr = itr.next;
        }
        return o;
    }
    private class Node {
        Node prev, next;
        T data;
    }
}
