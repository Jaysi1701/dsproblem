package bst;

public class BinarySearchTree {

    Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {

        if (current == null)
            return new Node(value);

        if (value < current.data)
            current.left = addRecursive(current.left, value);

        else if (value > current.data)
            current.right = addRecursive(current.right, value);

        return current;
    }

    // Search method
    public boolean search(Node node, int key) {

        if (node == null)
            return false;

        if (node.data == key)
            return true;

        if (key < node.data)
            return search(node.left, key);

        return search(node.right, key);
    }

    public int size(Node node) {

        if (node == null)
            return 0;

        return 1 + size(node.left) + size(node.right);
    }

    public void printInOrder(Node node) {

        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }
}