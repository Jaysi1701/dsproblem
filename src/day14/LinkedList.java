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

        if (prevNode == tail) tail = newNode;
    }

    public Node<T> search(T key) {
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data.equals(key)) return temp;
            temp = temp.next;
        }

        return null;
    }

    // Delete specific node
    public void delete(T key) {

        if (head == null) return;

        // if first node
        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node<T> temp = head;

        while (temp.next != null) {

            if (temp.next.data.equals(key)) {
                temp.next = temp.next.next;

                if (temp.next == null)
                    tail = temp;

                return;
            }

            temp = temp.next;
        }
    }

    // Count nodes
    public int size() {

        int count = 0;
        Node<T> temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
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