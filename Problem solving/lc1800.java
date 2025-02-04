public class lc1800 {

        int s = 0;
        int i = 0;
        int[] x;

    public int maxAscendingSum(int[] nums) {
        x = nums;
        s = nums.length;
        int iInc = 0;
        if (s == 1)
            return 1;
        for (int j = 0; j < s; j++) {
            iInc = Math.max(iInc, isIncreasing(j));
        }

        return iInc;
    }
//10,20,30,5,10,50
    int isIncreasing(int n) {
        int sum=x[n];
        for (i = n; i < s - 1; i++) {
            if (x[i] < x[i + 1]) {
                sum+=x[i+1];

            }else{
                return sum;
            }
        }
        //System.out.println("sum from loop2: "+sum);
        return sum;
    }
}
