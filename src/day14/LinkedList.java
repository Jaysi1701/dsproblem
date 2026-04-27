package day14;

public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert after given node
    public void insertAfter(Node<T> prevNode, T data) {

        if (prevNode == null) {
            return;
        }

        Node<T> newNode = new Node<>(data);

        newNode.next = prevNode.next;
        prevNode.next = newNode;

        if (prevNode == tail) {
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