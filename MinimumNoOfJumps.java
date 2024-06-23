import java.util.*;
public class MinimumNoOfJumps {

    static int minJumps(int[] arr){

        int range = arr[0];
        int i = 0;
        int ans = 0;
        int n=arr.length;

        if (n <= 1) return 0;
        if (arr[0] == 0) return -1;

        while (range < n - 1) {
            int temp = range;
            while (i < n && i <= range) {
                temp = Math.max(temp, arr[i] + i);
                i++;
            }
            if (temp == range) {
                return -1; // No progress can be made
            }
            range = temp;
            ans++;
        }
        return ans + 1;
    }


    public static void main(String[] args){

        int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        MinimumNoOfJumps.minJumps(arr);
    }
}
