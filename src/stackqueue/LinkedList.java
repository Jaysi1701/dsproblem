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

    public void printList() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}