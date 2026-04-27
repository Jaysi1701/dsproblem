package day14;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Create list
        list.append(56);
        list.append(30);
        list.append(70);

        // Search node 30
        Node<Integer> node30 = list.search(30);

        // Insert 40 after 30
        list.insertAfter(node30, 40);

        list.printList();
    }
}