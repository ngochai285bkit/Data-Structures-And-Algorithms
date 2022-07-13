package _1_Array_and_String;

public class _387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        int result = -1;
        int[] count = new int[128];
        char[] arr = s.toCharArray();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < length; i++) {
            if (count[arr[i]] == 1) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(firstUniqChar(s));
    }

}
