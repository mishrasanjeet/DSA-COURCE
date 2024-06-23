import java.util.*;
public class MaxiMumProfit {
    public static int maxProfit(int[] prices) {
        int buy=prices[0];
        int idx=0;
        int sell=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<buy){
                buy=prices[i];
                idx=i;
            }
            sell=buy;

        }

        for(int i=idx+1; i<prices.length; i++){
            if(prices[i]>sell){
                sell=prices[i];
            }
        }
        if(sell==0){
            return 0;
        }

        return sell-buy;
    }

    public  static void main(String[] args){
        int arr[] ={2,4,1};

        int profit=MaxiMumProfit.maxProfit(arr);
        System.out.println(profit);
    }
}
