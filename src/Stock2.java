import java.util.HashMap;
import java.util.Map;

public class Stock2 {

    public static void main(String[] args) {

        int [] prices = {10,1,5,6,7,1};
        System.out.println(maxProfit(prices));
    }


    public static int maxProfit(int[] prices) {
        Map<String, Integer> dp = new HashMap<>();
        return dfs(0, true, prices, dp);
    }

    private static int dfs(int i, boolean buying, int[] prices, Map<String, Integer> dp) {
        if (i >= prices.length) {
            return 0;
        }
        String key = i + "," + buying; // Encode 'i' and 'buying' into a String key
        if (dp.containsKey(key)) {
            System.out.println(dp.get(key));
            return dp.get(key);

        }

        int cooldown = dfs(i + 1, buying, prices, dp);
        System.out.println(cooldown);
        if (buying) {
            int buy = dfs(i + 1, !buying, prices, dp) - prices[i];
            dp.put(key, Math.max(buy, cooldown));
        } else {
            int sell = dfs(i + 2, !buying, prices, dp) + prices[i];
            dp.put(key, Math.max(sell, cooldown));
        }
        return dp.get(key);
    }
}
