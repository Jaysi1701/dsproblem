package stackqueue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println("Before Dequeue:");
        queue.printQueue();

        System.out.println("Removed = " + queue.dequeue());

        System.out.println("After Dequeue:");
        queue.printQueue();
    }
}