
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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





//        int[] arr = {1,2,3};
//        for (int i = 0; i < arr.length;i++) {
//            System.out.println(arr[i]);
//        }

        Node itr = head;
        int[] copy = new int[4];
        int index = 3;

        while(itr != null) {
            System.out.println(itr);
            copy[index--] = itr.data;
            itr = itr.next;
        }



        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i] + " ");
        }

        printBackwards(head);


    }

    static void printBackwards(Node head) {
        System.out.println("Printing backwards: ");
        printBackwardsRecursive(head);
    }

    static void printBackwardsRecursive(Node itr) {
        if (itr == null) {
            return;
        }
        printBackwardsRecursive(itr.next);
        System.out.print(itr.data + " ");
    }
}

class Node {
    int data;
    Node next;

    public String toString() {
        return "" + data;
    }
}
