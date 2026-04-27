package stackqueue;

public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;

    // For stack
    public void add(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // For queue
    public void append(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T peek() {
        if (head == null) return null;
        return head.data;
    }

    public T pop() {
        if (head == null) return null;

        T value = head.data;
        head = head.next;

        if (head == null)
            tail = null;

        return value;
    }

    public boolean isEmpty() {
        return head == null;
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