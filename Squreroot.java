import java.util.*;
public class Squreroot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number which you want to find the square root for that.");
        int number=sc.nextInt();

        int[] arr=new int[number-1];

        for(int i=0; i<number-1; i++){
            arr[i]=i;
        }
        int ans=0;
        int start=0;
        int end=number-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(mid*mid==number){
                System.out.println("the square root of number is"+mid);
                ans=0;
                break;
            }
            if(mid*mid>number){
                end=mid-1;
            }

            if(mid*mid<number){
                ans=mid;
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        if(ans!=0){
            System.out.println("the nearest suare root of number is"+ans);
        }
    }
}
