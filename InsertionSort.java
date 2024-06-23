import java.util.*;
public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("please enter the data in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<n; i++){
            int temp=arr[i];
            int j=i-1;
            for(; j>=0; j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }


            }
            arr[j+1]=temp;
        }
        System.out.println("The sorted element is ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
