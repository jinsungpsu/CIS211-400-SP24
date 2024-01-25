public class Main {
    Node<Character> n8 = new Node<>('h', null);
    Node<Character> n7 = new Node<>('g', n8);
    Node<Character> n6 = new Node<>('f', n7);
    Node<Character> n5 = new Node<>('e', n6);
    Node<Character> n4 = new Node<>('d', n5);
    Node<Character> n3 = new Node<>('c', n4);
    Node<Character> n2 = new Node<>('b', n3);
    Node<Character> n1 = new Node<>('a', n2);

    // print out all the items in this linked list

    // print out all the items BACKWARDS - this will be hard and awkward, but try it

    // print out every other node

}

class Node<T> {
    T data;
    Node next;

    Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
}
