import java.util.*;
import java.util.stream.IntStream;

public class MergeSort {
    public static void main(String[] args) {

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
        System.out.println();
        mergeSort(arr , 0 , n - 1);
        System.out.println("After Sorting");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr , int s , int e){
        //base case
        if(s >= e)
            return;

        int mid = (s + e)/2;
        //left Part
        mergeSort(arr , s , mid);
        //right part
        mergeSort(arr , mid + 1 , e);
        merge(arr , s , e);
    }

    public static void merge(int[] arr , int s , int e ){

        int mid = (s + e)/2;
        int len1 = mid - s + 1; //length of first half
        int len2 = e - mid; //length of second half
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        // Copy elements into these arrays
        System.arraycopy(arr, s, arr1, 0, len1);
        System.arraycopy(arr, mid + 1, arr2, 0, len2);

        // Merge two sorted arrays using Streams
        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();

        // Copy the merged array back into the original array
        System.arraycopy(merged, 0, arr, s, merged.length);


        /*//copy elements in these arrays;
        int originalArrayIndex = s;
        for(int i = 0; i < len1; i++){
            arr1[i] = arr[originalArrayIndex++];
        }

//        originalArrayIndex = mid + 1;

        for(int i = 0; i < len2; i++){
            arr2[i] = arr[originalArrayIndex++];
        }

        //merge two sorted arrays;
        originalArrayIndex = s;

        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < len1 && idx2 < len2){
            if(arr1[idx1] < arr2[idx2]){
                arr[originalArrayIndex++] = arr1[idx1++];
            }
            else {
                arr[originalArrayIndex++] = arr2[idx2++];
            }
        }

        //if in arr1 elements are remaining
        while(idx1 < len1){
            arr[originalArrayIndex++] = arr1[idx1++];
        }
        //if in arr2 elements are remaining
        while(idx2 < len2){
            arr[originalArrayIndex++] = arr2[idx2++];
        }*/
    }
}