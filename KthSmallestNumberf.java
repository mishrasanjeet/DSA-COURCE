import java.util.*;
public class KthSmallestNumberf {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the data in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("please enter the kth position");
        int k=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("the kth position smallest element is"+arr[k-1]);
    }
}
