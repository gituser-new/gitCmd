import java.util.HashMap;
import java.util.Map;

public class garbageCollection {
    public static void main(String[] args){
        System.out.println(garbageCollect());
    }
    public static int garbageCollect() {

        String[]  garbage = {"G","P","GP","GG"};
        int[] travel = {2,4,3};

        Map<Character, Integer> last = new HashMap<>(3);
        int ans = 0;
        //System.out.println(garbage.length); >4
        for (int i = 0; i < garbage.length; ++i) {
            String s = garbage[i];
            ans += s.length();
            for (char c : s.toCharArray()) {
                last.put(c, i);
                //System.out.println(last);
            }
        }
        System.out.println(last.values()+"ans"+ans);
        //time to pick garbage + time to travel next house> 6+
        int ts = 0;
        for (int i = 1; i <= travel.length; ++i) {
            ts += travel[i - 1];
            System.out.println("ts"+ts+"ans"+ans);
            for (int j : last.values()) {
                if (i == j) {
                    System.out.println("i"+i+"j"+j);
                    ans += ts;
                }
            }
        }

        return ans;
    }
}