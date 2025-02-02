public class lc3151 {
    public boolean isArraySpecial(int[] nums) {
        int l=nums.length;
        if(l==1){
            return true;
        }else{
            for(int i=1;i<l;i++){
                if(nums[i-1]%2==nums[i]%2)
                    return false;
            }
        }
        return true;
    }
}
