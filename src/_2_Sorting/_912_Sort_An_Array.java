package _2_Sorting;

import java.util.Arrays;

public class _912_Sort_An_Array {
    private static int[] merge(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int length = length1 + length2;
        int[] result = new int[length];
        int i = 0, i1 = 0, i2 = 0;
        while (i < length) {
            if (i1 < length1 && i2 < length2) {
                if (arr1[i1] <= arr2[i2]) {
                    result[i] = arr1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = arr2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < length1) {
                    result[i] = arr1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = arr2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    private static int[] mergeSort(int[] nums, int iLeft, int iRight) {
        if (iLeft > iRight) {
            return new int[0];
        }
        if (iLeft == iRight) {
            int[] singleElement = { nums[iLeft] };
            return singleElement;
        }
        int iMiddle = (iLeft + iRight) / 2;
        int[] arr1 = mergeSort(nums, iLeft, iMiddle);
        int[] arr2 = mergeSort(nums, iMiddle + 1, iRight);

        int[] result = merge(arr1, arr2);
        return result;
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int key = nums[(left + right) / 2];
        int pivot = partition(nums, left, right, key);
        quickSort(nums, left, pivot - 1);
        quickSort(nums, pivot, right);
    }

    private static int partition(int[] nums, int left, int right, int key) {
        int i = left;
        int j = right;
        while (i <= j) {
            while (nums[i] < key) {
                i++;
            }
            while (nums[j] > key) {
                j--;
            }
            if (i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        quickSort(nums, 0, n - 1);
        return nums;
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 5, 7, 6, 9, 8, 1, 4 };
        System.out.println(Arrays.toString(sortArray(a)));
    }
}
