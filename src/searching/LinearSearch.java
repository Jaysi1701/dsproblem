package searching;

public class LinearSearch {

    public static int findFirstNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, -3, 7, -1};

        int result = findFirstNegative(arr);

        System.out.println("Index = " + result);
    }
}