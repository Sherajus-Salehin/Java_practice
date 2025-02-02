public class lc1752 {
    int s=0;
    public boolean check(int[] nums) {

        s=nums.length;
        int c=isSorted(nums);
        if(c==0)
            return true;
        else {
            for(int i=0;i<c;i++){
                nums=rotate(nums);
            }
            if (isSorted(nums)==0){
                return true;
            }
        }
        return false;
    }
    int[] rotate( int[]x){
        int temp=x[0];
        for(int i=0;i<s-1;i++){
            x[i]=x[i+1];
        }
        x[s-1]=temp;
        return x;
    }
    int isSorted(int[]x){
        for(int i=1;i<s;i++){
            if(x[i-1]>x[i]){
                return i;
            }
            if(i==(s-1))
                return 0;
        }
    return 0;
    }
}
