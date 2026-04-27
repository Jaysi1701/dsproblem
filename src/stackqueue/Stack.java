package stackqueue;

public class Stack<T> {

    LinkedList<T> list = new LinkedList<>();

    public void push(T data) {
        list.add(data);
    }

    public T peek() {
        return list.peek();
    }

    public T pop() {
        return list.pop();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printStack() {
        list.printList();
    }
}