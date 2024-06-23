import java.util.*;
public class InversionCount {

    public static long merge(int[] arr,int mid,int start,int end){
        long inv=0;
        int n1=mid-start+1;
        int n2=end-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        System.arraycopy(arr,0,arr1,0,n1);
        System.arraycopy(arr,mid+1,arr2,0,n2);
        int i=0; int j=0; int k=start;
        while(i<n1 && j<n2){
            if(arr[i]<=arr[j]){
              arr[k]=arr[i];
              k++;
              i++;
            }else{
                arr[k]=arr[j];
                inv+=n1-i;
                j++;
                k++;
            }
        }

        while(i<n1){
            arr[k++]=arr[i++];
        }
        while(j<n2){
            arr[k++]=arr[j++];
        }

        return inv;
    }
    public static long MergeSort(int[] arr,int start,int end){
         long inv=0;
         if(start<end) {

             int mid = (start + end) / 2;
             inv += MergeSort(arr, start, mid);
             inv += MergeSort(arr, mid + 1, end);
             inv += merge(arr, mid, start, end);
         }

        return inv;
    }
    public static void main(String[] args){
        long inv=0;
       int arr[] = {2, 4, 1, 3, 5};
       int start=0;
       int end=arr.length-1;

      inv=InversionCount.MergeSort(arr,start,end);
      System.out.println("Invenrsion count Of This Array is"+inv);

    }
}
