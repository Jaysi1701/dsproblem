package day14;

public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;

    // Add at beginning
    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Add at end
    public void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Print list
    public void printList() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Delete first
    public void pop() {
        if (head != null)
            head = head.next;
    }

    // Delete last
    public void popLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node<T> temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }
}