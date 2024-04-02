import java.util.*;
public class FirstOccurenceLastOccurence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of an array");
        int n=sc.nextInt();
        int[] arr = new int[n];

        System.out.println("please enter the data in array");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Please enter the data for finnding the occurence:");
        int data=sc.nextInt();
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        int firstoccurence=0;
        int lastoccurence=0;
        while(start<=end){

            if(data==arr[mid]){
                firstoccurence=mid;
                end=mid-1;
            }if(data<arr[mid]){
                end=mid-1;
            }if(data>arr[mid]){
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        System.out.println("first occurence of data is"+firstoccurence);
         start=0;
         end=n-1;
         mid=start+(end-start)/2;

        while(start<=end){

            if(data==arr[mid]){
                lastoccurence=mid;
                start=mid+1;
            }if(data<arr[mid]){
                end=mid-1;
            }if(data>arr[mid]){
                start=mid+1;
            }
            mid=start+(end-start)/2;

        }
        System.out.println("last occurence of data is"+lastoccurence);

    }
}
