package _1_Array_and_String;

import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // for (int x : nums2) {
        //     insertElement(nums1, m, x);
        //     m++;
        // }
        
        // Sử dụng kỹ thuật 2 con trỏ
        int k = nums1.length - 1;
        int i = m-1, j = n-1;
        while(k>=0){
            if(j<0){
                nums1[k] = nums1[i];
                i--;
            } else if(i<0){
                nums1[k] = nums2[j];
                j--;
            } else {
                if(nums1[i]>nums2[j]){
                    nums1[k] = nums1[i];
                    i--;
                } else {
                    nums1[k] = nums2[j];
                    j--;
                }
            }
            k--;
        }
    }

    // private static void insertElement(int[] nums1, int m, int value) {
    //     boolean found = false;
    //     for (int i = 0; i < m; i++) {
    //         if (nums1[i] > value) {
    //             found = true;
    //             for (int j = m - 1; j >= i; j--) {
    //                 nums1[j + 1] = nums1[j];
    //             }
    //             nums1[i] = value;
    //             break;
    //         }
    //     }
    //     if (found == false) {
    //         nums1[m] = value;
    //     }
    // }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        merge(arr1, 3, arr2, 3);
        System.out.println(Arrays.toString(arr1));
    }
}
