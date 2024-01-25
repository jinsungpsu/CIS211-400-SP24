public class Main {
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.data = 1;
        Node n2 = new Node();
        n2.data = 2;
        Node n3 = new Node();
        n3.data = 3;

        Node head = n1;
        Node tail = n2;

        n1.next = n2;
        n2.next = n3;
        n3.next = new Node();
        n3.next.data = 4;
        n2.next.next.data = 4; // same as previous
        n1.next.next.next.data = 4; // same as previous
        head.next.next.next.data = 4; // same as previous

//        in an array, the "i" is the iterator
//        int[] arr = {1,2,3};
//        for (int i = 0; i < arr.length;i++) {
//            System.out.println(arr[i]);
//        }

      // in LL, we use a ref var to iterate
        Node itr = head;

        while(itr != null) {
            System.out.println(itr);
            itr = itr.next;
        }


    }
}

class Node {
    int data;
    Node next;

    public String toString() {
        return "" + data;
    }
}
