package _1_Array_and_String;

public class _27_Remove_Element {

    public static int removeElement(int[] nums, int val) {

        // int len = nums.length;
        // for (int i = 0; i < len; i++) {
        //      if (nums[i] == val) {
        //          for (int j = i + 1; j < len; j++) {
        //               nums[j - 1] = nums[j];
        //          }
        //          len--;
        //          i--;
        //      }
        // }
        // return len;

        // Sử dụng kỹ thuật hai con trỏ
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 2, 5, 6, 5, 6, 7 };
        int k = removeElement(arr, 6);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
