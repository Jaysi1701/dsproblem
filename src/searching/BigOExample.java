package runtime;

public class BigOExample {

    public static void main(String[] args) {

        int n = 5;

        // O(1)
        int x = n + 10;

        // O(N)
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // O(N^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}