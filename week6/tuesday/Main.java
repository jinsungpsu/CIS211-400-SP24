public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new CircularLinkedStack<>();

        System.out.println("Pushing: 1");
        s.push(1);
        System.out.println(s);
        System.out.println("Pushing: 2");
        s.push(2);
        System.out.println(s);
        System.out.println("Pushing: 3");
        s.push(3);
        System.out.println(s);

        System.out.println("Popping: "+s.pop());
        System.out.println(s);
        System.out.println("Pushing: 4");
        s.push(4);
        System.out.println(s);

        System.out.println("Popping: "+s.pop());
        System.out.println(s);
        System.out.println("Pushing: 5");
        s.push(5);
        System.out.println(s);
        System.out.println("Pushing: 6");
        s.push(6);
        System.out.println(s);
        System.out.println("Pushing: 7");
        s.push(7);
        System.out.println(s);

        System.out.println("Empty all: ");
        while (!s.isEmpty()) {
            System.out.println("Popping: "+s.pop());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Pushing " + i);
            s.push(i);
        }
    }
}
