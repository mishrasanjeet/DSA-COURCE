import java.util.*;
public class QuickSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the data in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        int s=0;
        QuickSort(arr,s,n-1);
        System.out.println("after Sorting");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void  QuickSort(int[] arr,int s,int e ){

        if(s>=e){
            return;
        }
        int p=partation(arr,s,e);
        QuickSort(arr,s,p-1);
        QuickSort(arr,p+1,e);
    }

    public static int partation(int[] arr,int s,int e){
         int pivot=arr[s];
         int count=0;
         for(int i=s + 1;i<=e; i++){
             if(arr[i]<=pivot){
                 count++;
             }

         }
        int pivotIndex = s + count;

        // Swap pivot to its correct position
        swap(arr, s, pivotIndex);

        int i=0;
         int j=e;
         while(i<pivotIndex && j>pivotIndex){
             while(arr[i]<pivot){
                 i++;
             }
             while(arr[j]>pivot){
                 j--;
             }
             if (i < pivotIndex && j > pivotIndex) {
                 swap(arr, i, j);
                 i++;
                 j--;
             }
         }
         return pivotIndex;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
