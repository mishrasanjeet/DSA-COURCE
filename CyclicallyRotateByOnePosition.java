import java.util.*;
public class CyclicallyRotateByOnePosition {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        for(int i=arr.length-1; i>0; i--){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        System.out.println("After cyclically rotate the array is");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
