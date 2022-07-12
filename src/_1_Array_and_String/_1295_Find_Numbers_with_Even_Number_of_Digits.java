package _1_Array_and_String;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int x : nums) {
            if (hasEvenNumberOfDigits(x)) {
                count++;
            }
        }
        return count;
    }

    private static boolean hasEvenNumberOfDigits(int n) {
        int numberOfDigits = 0;
        while (n != 0) {
            numberOfDigits++;
            n /= 10;
        }
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 43, 564, 223, 211, 3445, 558695 };
        System.out.println(findNumbers(arr));
    }

}
