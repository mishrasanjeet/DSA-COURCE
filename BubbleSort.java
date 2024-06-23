import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("please enter the data in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            boolean swapped=false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

            }
            if(swapped==false){
                break;
            }
        }
        System.out.println("the sorted element of an array is");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
