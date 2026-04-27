package stackqueue;

public class LinkedList<T> {

    Node<T> head;

    public void add(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Show top element
    public T peek() {

        if (head == null)
            return null;

        return head.data;
    }

    // Remove top element
    public T pop() {

        if (head == null)
            return null;

        T value = head.data;
        head = head.next;

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