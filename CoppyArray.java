import java.util.*;
public class CoppyArray {

    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        int arr2[]={7,8,9};
        int n=arr.length;
        int m=arr2.length;
        int arr3[]=new int[n+m];

        System.arraycopy(arr,0,arr3,0,n);
        System.arraycopy(arr2,0,arr3,n,m);


        for(int i=0; i<arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }
}
