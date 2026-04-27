package day14;

public class LinkedList<T extends Comparable<T>> {

    Node<T> head;
    Node<T> tail;

    // Sorted add
    public void sortedAdd(T data) {

        Node<T> newNode = new Node<>(data);

        // Empty list
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Insert at beginning
        if (data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> temp = head;

        while (temp.next != null &&
                data.compareTo(temp.next.data) > 0) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void printList() {

        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}