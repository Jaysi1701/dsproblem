package day14;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.sortedAdd(56);
        list.sortedAdd(30);
        list.sortedAdd(40);
        list.sortedAdd(70);

        list.printList();
    }
}