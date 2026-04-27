package stackqueue;

public class Queue<T> {

    LinkedList<T> list = new LinkedList<>();

    // Insert at end
    public void enqueue(T data) {
        list.append(data);
    }

    // Remove from beginning
    public T dequeue() {
        return list.pop();
    }

    public void printQueue() {
        list.printList();
    }
}