package bst;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println("Inorder Traversal:");
        bst.printInOrder(bst.root);
    }
}