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
            if (isSorted) {
                break;
            }
            System.out.println("\t" + Arrays.toString(a));
            n--;
        }
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
            System.out.println("\t" + Arrays.toString(a));
        }
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
            System.out.println("\t" + Arrays.toString(a));
        }
    }

    public static void quickSort(int[] a, int Left, int Right) {
        if (Left >= Right) {
            return;
        }
        int key = a[(Left + Right) / 2];
        int pivot = partition(a, Left, Right, key);
        quickSort(a, Left, pivot - 1);
        quickSort(a, pivot, Right);
    }

    private static int partition(int[] a, int Left, int Right, int key) {
        int i = Left;
        int j = Right;
        while (i <= j) {
            while (a[i] < key) {
                i++;
            }
            while (a[j] > key) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 8, 3, 5, 4, 9, 7, 6 };
        System.out.println("Bubble Sort: " + Arrays.toString(a));
        bubbleSort(a);

        int[] b = { 1, 9, 8, 3, 5, 4, 2, 7, 6 };
        System.out.println("Insertion Sort: " + Arrays.toString(a));
        insertionSort(b);

        int[] c = { 9, 2, 3, 1, 4, 6, 5, 7, 8 };
        System.out.println("Selection Sort: " + Arrays.toString(c));
        selectionSort(c);

        int[] d = { 4, 2, 3, 5, 7, 6, 8, 9, 1 };
        System.out.println("Quick Sort: " + Arrays.toString(d));
        quickSort(d, 0, d.length - 1);
        System.out.println("==> " + Arrays.toString(d));
    }
}
