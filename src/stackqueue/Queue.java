package stackqueue;

public class Queue<T> {

    LinkedList<T> list = new LinkedList<>();

    public void enqueue(T data) {
        list.append(data);
    }

    public void printQueue() {
        list.printList();
    }
}