import java.util.*;
public class MaxAndMinElementsOfAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the data in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("after sorting the array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("the minimum element of an array is"+" "+arr[0]+" "+"the maximum element of an array is"+" "+arr[n-1]);
    }
}
