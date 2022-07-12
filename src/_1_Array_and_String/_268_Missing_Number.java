package _1_Array_and_String;

public class _268_Missing_Number {
    public static int missingNumber(int[] nums) {
        int result = 0;
        int[] temp = new int[nums.length+1];
        for(int i = 0; i<nums.length; i++){
            temp[nums[i]] = 1;
        }
        for(int i = 0; i<temp.length; i++){
            if(temp[i]!=1){
                result = i;
                break;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 3, 1};
        System.out.println(missingNumber(nums));
    }
}
