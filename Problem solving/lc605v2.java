public class lc605v2 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int s = flowerbed.length;

        for (int i = 0; i < s; i++) {
            if (flowerbed[i] == 0) {
                if (((i == 0) || (flowerbed[i - 1] == 0)) && ((i == s - 1) || (flowerbed[i + 1] == 0))) {
                    flowerbed[i] = 1;  // Plant
                    count++;
                    i++;
                }
            }
        }

        return count >= n;
    }

}
