package day14;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.append(56);
        list.append(30);
        list.append(70);

        Node<Integer> foundNode = list.search(30);

        if (foundNode != null) {
            System.out.println("Node Found : " + foundNode.data);
        } else {
            System.out.println("Node Not Found");
        }
    }
}