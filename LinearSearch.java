import java.time.Clock;
import java.util.*;
public class LinearSearch {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("please enter the data in array");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the search data:");
        int data=sc.nextInt();
        boolean isData=false;
        for(int i=0; i<n; i++){
            if(arr[i]==data){
                System.out.println("data fount at index"+i);
                isData=true;
            }
        }
        if(!isData){
            System.out.println("data not found in this array.");
        }
    }
}
