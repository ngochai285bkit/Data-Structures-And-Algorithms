package _4_Binary_Search;

public class _704_Binary_Search {
    public static int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int iLeft = 0;
        int iRight = n - 1;
        while (iLeft <= iRight) {
            int iMiddle = (iLeft + iRight) / 2;
            if (nums[iMiddle] == target) {
                return iMiddle;
            } else if (nums[iMiddle] > target) {
                iRight = iMiddle - 1;
            } else {
                iLeft = iMiddle + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int iLeft, int iRight) {
        if (iLeft > iRight) {
            return -1;
        }
        int iMiddle = (iLeft + iRight) / 2;
        if (nums[iMiddle] == target) {
            return iMiddle;
        } else if (nums[iMiddle] > target) {
            return binarySearch(nums, target, iLeft, iMiddle - 1);
        } else {
            return binarySearch(nums, target, iMiddle + 1, iRight);
        }
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        return binarySearch(nums, target, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 8, 9 };
        System.out.println(binarySearch(a, 5));
        System.out.println(search(a, 7));
    }
}
