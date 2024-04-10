import java.util.*;
public class SearchElementInRotatedArray extends PivotElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("please enter the data in array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("please enter the data which  you want to serach in rotated and sorting array.");
          int data=sc.nextInt();
        int start=0;
        int end=n-1;

        int pivot=pivotElement(arr,n);
        if (arr[pivot] <= data && data <= arr[end]){
            start=pivot;
        }else{
            end=pivot-1;
        }
        while(start<=end){
            int mid=(start+end)/2;

            if(data==arr[mid]){
                System.out.print("data found at index"+mid);
                return;
            }if(data<arr[mid]){
                end=mid-1;
            }if(data>arr[mid]){
                start=mid+1;
            }
        }
    }

}
