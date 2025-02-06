import java.util.HashMap;
import java.util.Map;
public class lc1726 {
    public int tupleSameProduct(int[] nums) {
        int n= nums.length;
        Map<Integer, Integer> productFreq = new HashMap<>();
        int res=0;
        for(int i=0;i<n;i++) {
            for (int j = n - 1; j > i; j--) {
                int prod=nums[i] * nums[j];
                productFreq.put(prod, productFreq.getOrDefault(prod, 0) + 1);

            }
        }
        for (int freq : productFreq.values()) { // here key holds the values and values store frequency
            if (freq > 1) {
                res += 4 * (freq * (freq - 1)) / 2; // 4 * combination of (freq, 2)
            }
        }
        return res*2;
        }
    }
