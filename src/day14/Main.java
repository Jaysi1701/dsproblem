package day14;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // First node 70
        list.add(70);

        // Add 30 to 70
        list.add(30);

        // Add 56 to 30
        list.add(56);

        list.printList();
    }
}