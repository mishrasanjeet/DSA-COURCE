import java.util.*;
public class PivotElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("please enter the data in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int element=pivotElement(arr,n);

        System.out.println("the pivot elemnt is "+element);

    }

    public static int pivotElement(int[] arr,int n){
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        while(start<end){
            if(arr[mid]>=arr[0]){
                start=mid+1;

            }else{
                end=mid;
            }
            mid=start+(end-start)/2;
        }

        return start;
    }
}