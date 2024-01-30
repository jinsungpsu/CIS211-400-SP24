public class Main {
    public static void main(String[] args) {
        Stack<Integer> mystack = new LinkedStack<>();

        // don't do this!!!
        // this doesn't make sense
        // breaks abstraction
        // you should only interact with this object
        // using the Stack interface
        // who has NO knowledge of implementation details
        // in fact... you could create a new Stack interface
        // object using an ArrayStack instead...
        // so then... this would REALLY not make any sense
        // mystack.head.next = new Node();

        mystack.push(1);

        mystack.push(2);
        System.out.println("End of program!");
    }
}
