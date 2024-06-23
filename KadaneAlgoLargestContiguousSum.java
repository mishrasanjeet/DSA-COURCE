import java.util.*;
public class KadaneAlgoLargestContiguousSum {
    public static void main(String[] args){
        int[] arr={10,10,10,-20,5};
        int sum=0;
        int maxi=arr[0];
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
            maxi=Math.max(sum,maxi);
            if(sum<0){
                sum=0;
            }
        }

        System.out.println("the largest contiguous sum of array is"+" "+maxi);
    }
}
