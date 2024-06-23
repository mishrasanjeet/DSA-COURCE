import java.util.*;
public class UnionAndIntersactionOfTwoArry {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Set<Integer> set=new HashSet<Integer>();
        System.out.println("please enter the first array size.");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.println("please enter the element of an array");
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("first array is");
        for(int i=0; i<n; i++){
            System.out.println(arr1[i]+" ");
            set.add(arr1[i]);
        }
        System.out.println("please enter the Second Array array size.");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("please enter the element of an array");
        for(int i=0; i<n2; i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Second array is");
        for(int i=0; i<n2; i++){
            System.out.println(arr2[i]+" ");
            set.add(arr2[i]);
        }
        Iterator itr=set.iterator();
        while (itr.hasNext()){
            Integer i=(Integer)itr.next();
            System.out.println("the element of set is"+i);
        }
    }
}
