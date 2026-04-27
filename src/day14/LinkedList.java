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

    public void insertAfter(Node<T> prevNode, T data) {
        if (prevNode == null) return;

        Node<T> newNode = new Node<>(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        if (prevNode == tail) {
            tail = newNode;
        }
    }

    public void pop() {
        if (head == null) return;

        head = head.next;

        if (head == null) {
            tail = null;
        }
    }

    // Delete last node
    public void popLast() {

        if (head == null) return;

        // only one node
        if (head.next == null) {
            head = tail = null;
            return;
        }

        Node<T> temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
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