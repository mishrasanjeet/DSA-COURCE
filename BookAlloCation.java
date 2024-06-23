import java.util.*;
public class BookAlloCation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number of Book");
        int n=sc.nextInt();
        System.out.println("please enter the number of Pages");
        int[] arr=new int[n];
        int sum=0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        int start=0;
        int end=sum;
        int mid=(start+end)/2;
        int ans=0;
        while(start<=end){
            if(isPossibleSoln(mid,arr)){
                end=mid-1;
                ans=mid;
            }else {
                start=mid+1;
            }
            mid=(start+end)/2;
        }

        System.out.println("the minimum value is "+ans);
    }

    public static boolean isPossibleSoln(int mid,int arr[]){
        int student1=0;
        int student2=0;
        for(int i=0; i<arr.length; i++)
        {
            if(student1+arr[i]<=mid){
                student1=student1+arr[i];
            }else if(student2+arr[i]<=mid && arr[i]<=mid){
                student2=student2+arr[i];
            }else{
                return false;
            }
        }

        return true;
    }
}
