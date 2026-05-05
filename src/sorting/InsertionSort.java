package sorting;

public class InsertionSort {

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];   // element to insert
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place key at correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] empIDs = {105, 102, 110, 101, 108};

        insertionSort(empIDs);

        System.out.println("Sorted Employee IDs:");

        for (int id : empIDs)
            System.out.print(id + " ");
    }
}