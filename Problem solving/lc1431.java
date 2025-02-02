import java.util.List;
import java.util.ArrayList;

class lc1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ret = new ArrayList<Boolean>();
        int maxCandies = 0;
        for (int c : candies) {
            if (c > maxCandies)
                maxCandies = c;
        }
        for (int c : candies) {
            if (c + extraCandies >= maxCandies)
                ret.add(true);
            else
                ret.add(false);
        }
        return ret;
    }
}