import java.util.*;
public class MergeIntervals {


    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> stack=new Stack();
        stack.add(intervals[0]);
        for(int i=0; i<intervals.length; i++){
            int startpoint1=intervals[i][0];
            int endPoint1=intervals[i][1];

            int[] propArray=stack.pop();
            int startpoint2=propArray[0];
            int endPoint2=propArray[1];
            int endMax=Math.max(endPoint1,endPoint2);
            if(endPoint2>=startpoint1){
                int[] merge=new int[]{startpoint2,endMax};
                stack.add(merge);
            }else{
                stack.add(propArray);
                stack.add(intervals[i]);
            }

        }
        int[][] output=new int[stack.size()] [2];
        for(int i=output.length-1; i>=0; i--){
            int[] prop=stack.pop();
            output[i][0]=prop[0];
            output[i][1]=prop[1];
        }
        return output;

    }
    public static void main(String[] args){
       int a[][]={{1,3},{2,6},{8,10},{15,18}};
       int b[][]= MergeIntervals.merge(a);
       for(int i=0; i<b.length; i++){
           for(int j=0; j<b[i].length; j++){
               System.out.println(b[i][j]);
           }
       }

    }
}
