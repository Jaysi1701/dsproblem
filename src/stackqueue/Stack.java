package stackqueue;

public class Stack<T> {

    LinkedList<T> list = new LinkedList<>();

    public void push(T data) {
        list.add(data);
    }

    public void printStack() {
        list.printList();
    }
}