package day14;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        // Delete first node
        list.pop();

        list.printList();
    }
}