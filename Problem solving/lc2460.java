public class lc2460 {
    int li=0;
    int l=0;
    int t=0;
    int i;
    int[] num;
    public int[] applyOperations(int[] nums) {
        l=nums.length;
        li=l-1;
        num=new int[l];
        for(i=0;i<li;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        //LastNonZero();
        //a=make an array of only non zeros first, then make rest zero.
        for( i=0;i<l;i++){
            if (nums[i]!=0){
                num[t]=nums[i];
                t++;
            }
        }




        return num;
    }
}
