import java.util.*;
public class MinimizeTheMaximumDiffHeights {

    public static void main(String[] args){
        int k=2;
        int arr[]={1, 5, 8, 10};
        int n=arr.length;
        int min,max;
        int diff=arr[n-1]-arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]-k<0) continue;
            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            min=Math.min(arr[0]+k,arr[i]-k);

            diff=Math.min(diff,max-min);
        }
        System.out.println("The main difference is"+diff);
    }
}
