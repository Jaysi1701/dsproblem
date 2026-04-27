package day14;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(40);
        list.append(70);

        // Delete 40
        list.delete(40);

        list.printList();

        System.out.println("Size = " + list.size());
    }
}