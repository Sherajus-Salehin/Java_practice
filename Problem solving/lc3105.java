public class lc3105 {
    int s=0;
    int i=0;
    int[]x;
    public int longestMonotonicSubarray(int[] nums) {
        x=nums;
        s=nums.length;
        int iInc=0;
        int iDsc=0;
        if(s==1)
            return 1;
        for(int j=0;j<s;j++){
            iInc=Math.max(iInc,isIncreasing(j));
            iDsc=Math.max(iDsc,isDecreasing(j));
        }


    return (Math.max(iInc,iDsc)+1);
    }
    int isIncreasing(int n){
        for(i=n;i<s-1;i++){
            if(x[i]>=x[i+1]){
                return (i-n);
            }
        }
        return (i-n);
    }
    int isDecreasing(int n){
        for(i=n;i<s-1;i++){
            if(x[i]<=x[i+1]){
                return (i-n);
            }
        }
        return (i-n);
    }

}
