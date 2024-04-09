public class Main {
    public static void main(String[] args) {
        BST<String> bst = new BST<>();

        bst.insert("hi");
        bst.insert("bye");
        bst.insert("hello");
        bst.insert("goodbye");
        bst.insert("Hola");

        if (bst.search("goodbye")) {
            System.out.println("Found!");
        }

    }
}
