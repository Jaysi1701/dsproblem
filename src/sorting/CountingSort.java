package sorting;

public class CountingSort {

    public static void countingSort(int[] arr) {

        int max = 18;   // max age
        int min = 10;   // min age

        int range = max - min + 1;

        int[] count = new int[range];

        // Count frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        // Rebuild sorted array
        int index = 0;

        for (int i = 0; i < range; i++) {

            while (count[i] > 0) {

                arr[index] = i + min;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] ages = {12, 10, 14, 13, 12, 15, 11};

        countingSort(ages);

        System.out.println("Sorted Ages:");

        for (int age : ages)
            System.out.print(age + " ");
    }
}