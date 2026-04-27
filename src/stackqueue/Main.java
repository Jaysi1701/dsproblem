package stackqueue;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Peek = " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped = " + stack.pop());
        }

        System.out.println("Stack Empty");
    }
}