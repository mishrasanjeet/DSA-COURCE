import java.util.*;
public class NextPermutation {
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static  void nextPermutation(int[] nums) {
        int elements=0;
        int index=0;
        int reverseindex=0;

        for(int i=nums.length-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                elements=nums[i];
                index=i;
                reverseindex=i;
                break;
            }
        }
        if(elements==0 && index==0){
            reverse(nums);
            return;
        }
        for(int i=index+1; i<nums.length; i++){
            if(nums[reverseindex-1]<nums[i] && nums[index]>=nums[i]){
                index=i;
                elements=nums[i];
            }
        }
        int temp=nums[index];
        nums[index]=nums[reverseindex-1];
        nums[reverseindex-1]=temp;



        int length=nums.length-1;
        while(reverseindex<length){
            int tempo=nums[reverseindex];
            nums[reverseindex]=nums[length];
            nums[length]=tempo;
            reverseindex++;
            length--;

        }

    }

    public static void main(String[] args){
        int[] arr={2,3,1,3,3};
        NextPermutation.nextPermutation(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

    }
}
