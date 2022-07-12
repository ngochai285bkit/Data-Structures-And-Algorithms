package _1_Array_and_String;

public class _852_Peak_Index_in_a_Mountain_Array {
    public static int peakIndexInMountainArray(int[] arr) {
        int i;
        for(i=0; i<arr.length-1; i++){
            if(arr[i+1]<=arr[i]){
                break;
            }
        }
        if(i==arr.length-1){
            if(arr[i]<arr[i-1]){
                return i;
            }
            return 0;
        }
        boolean flag = true;
        for(int j = i; j<arr.length-1; j++){
            if(arr[j+1]>=arr[j]){
                flag = false;
                break;
            }
        }
        if(flag){
            return i;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
