package _2_Sorting;

import java.util.Arrays;

public class SortingAlgorithm {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        while (n > 1) {
            boolean isSorted = true;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    isSorted = false;
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                }
            }
            System.out.println("\t" + Arrays.toString(a));
            n--;
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 4, 6 };
        System.out.println("Bubble Sort: " + Arrays.toString(a));
        bubbleSort(a);
    }
}
