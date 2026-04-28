package bst;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {
                56,30,70,22,40,60,95,
                11,65,3,16,63,67
        };

        for (int value : values) {
            bst.add(value);
        }

        boolean found = bst.search(bst.root, 63);

        System.out.println("Found = " + found);
    }
}