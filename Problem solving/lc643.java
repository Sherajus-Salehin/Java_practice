public class lc643 {
    public double findMaxAverage(int[] nums, int k) {
        int l=nums.length;
        if(l==1 && k==1){
            return nums[0];
        }

        int t=0;
        double maxInt=-Math.pow((10),4);
        while(t<=l-k){
            int sum=0;
            for (int i=t;i<t+k;i++){
               // System.out.print(","+nums[i]+",");
                sum+=nums[i];
            }
            //System.out.println("sum="+sum+" average="+(double)sum/k);
            //double average=sum/k;
            maxInt=Math.max(maxInt, (double) sum /k);
            t++;
        }
    return maxInt;
    }
}
