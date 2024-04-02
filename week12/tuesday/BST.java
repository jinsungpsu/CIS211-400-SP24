public class BST<T extends Comparable<T>>{
    private Node root;

    public void insert(T item) {

    }

    public boolean search(T item) {
        Node itr = root;
        return search(item, itr);
    }

    private boolean search(T item, Node root) {
        if (item == root.data) {
            // found the thing I'm lookin for
            return true;
        } else {
            if (item.compareTo(root.data) > 0) {
                // same as saying item > root.data
                // go right
                search(item, root.right);
            } else {
                // go left
                search(item, root.left);
            }
        }
        return false;
    }

    class Node {
        Node left, right;
        T data;
    }
}

class Main2{
    public static void main(String[] args) {
        BST<Pokemon> tree = new BST<>();
        BST<String> sTree = new BST<>();
    }
}
class Pokemon implements Comparable<Pokemon>{
    private String name;
    private int attack;

    @Override
    public int compareTo(Pokemon o) {
        if (this.attack > o.attack) {
            return 1;
        } else if (this.attack < o.attack) {
            return -1;
        }
        return 0;
    }
}
