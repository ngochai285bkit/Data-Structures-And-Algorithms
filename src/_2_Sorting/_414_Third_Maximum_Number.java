package _2_Sorting;

public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        int n = nums.length;
        long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
        for (int i = 0; i < n; i++) {
            insert(maxArr, nums[i]);
        }
        if (maxArr[2] != Long.MIN_VALUE) {
            return (int) maxArr[2];
        }
        return (int) maxArr[0];
    }

    private static void insert(long[] maxArr, int value) {
        int n = maxArr.length;
        int i = 0;
        while (i < n) {
            if (value == maxArr[i]) {
                return;
            } else if (value < maxArr[i]) {
                i++;
            } else {
                break;
            }
        }
        if(i<maxArr.length){
            for(int j = maxArr.length-1; j>i; j--){
                maxArr[j] = maxArr[j-1];
            }
            maxArr[i] = value;
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 2, 4, 1, 3, 6, 0 };
        System.out.println(thirdMax(a));
    }
}
