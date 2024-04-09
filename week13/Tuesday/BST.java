// The search method still has some small issues, so not working

public class BST<T extends Comparable<T>>{
    private Node root;

    public void insert(T item) {
        if (root == null) {
            // special case for empty tree
            root = new Node();
            root.data = item;
            return;
        }
        Node itr = root;
        insert(item, itr);
    }

    private void insert(T item, Node root) {
        if (item.compareTo(root.data) > 0) {
            if (root.right == null) {
                // if item.data > root.data
                // i've fallen off the tree
                Node node = new Node();
                node.data = item;
                root.right = node;
                return;
            }
            // same as saying item > root.data
            // go right
            insert(item, root.right);
        } else {
            if (root.left == null) {
                // i've fallen off the tree
                Node node = new Node();
                node.data = item;
                root.left = node;
                return;
            }
            // go left
            insert(item, root.left);
        }

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
                return search(item, root.right);
            } else {
                // go left
                return search(item, root.left);
            }
        }
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
