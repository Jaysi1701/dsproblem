package day14;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Create 56 -> 70
        list.append(56);
        list.append(70);

        // Insert 30 after 56
        list.insertAfter(list.head, 30);

        list.printList();
    }
}