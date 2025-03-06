public class lc238 {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] answer=new int[n];
        int r=1;
        int l=1;
        int zl=-1;
        boolean zc=false;
        //marge zero protocol & left calc
        for(int z=0;z<n;z++){
            if(nums[z]==0 && !zc){
                zc=true;
                zl=z;
            } else if (nums[z]==0 && zc) {
                answer=new int[n];
                return answer;
            }else {
                //left calc
                answer[z]=l;
                l*=nums[z];
            }
        }
        if(zl!=-1){
            answer=new int[n];
            answer[zl]=l;
            return answer;
        }
        //right calc
        for(int j=n-1;j>=0;j--){
            answer[j]*=r;
            r*=nums[j];
        }
        return answer;
    }
}
