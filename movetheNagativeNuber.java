import java.util.*;
public class movetheNagativeNuber {
    public static void main(String[] args){
        int[] arr={4,-3,2,-2,1,5,9,-4};
        System.out.println("before move the negative number");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }

        System.out.println("after move the negative number");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
