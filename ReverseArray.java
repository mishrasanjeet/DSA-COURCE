import java.util.*;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the data in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("before the reversing of an array");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        int start=0;
        int end=n-1;
        int i=0;
        int j=n-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("after the reversing of an array");
        for(int p=0; p<n; p++){
            System.out.println(arr[p]+" ");
        }
    }
}
