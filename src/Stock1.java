public class Stock1  {

    /*
    You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.

You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.

Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0.
     //prices = [10,8,7,5,2],  int [] prices = {10,1,5,6,7,1};
     */

    public static void main(String[] args) {

        int [] prices = {10,1,5,6,7,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {

        int left =0;
        int right =1;
        int maxprofit =0;

        while(right<prices.length){

            if(prices[left]<prices[right]){  //price

                maxprofit= Math.max(maxprofit,prices[right]-prices[left]);
                System.out.println(maxprofit);
            }
            else{

                left =right;  //index
            }
            right++;

        }
        return maxprofit;

    }
}