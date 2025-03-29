import java.util.Arrays;

public class lc1679v2 {
    public int maxOperations(int[] nums, int k) {
    int pc=0;
    Arrays.sort(nums);
    int i=0;
    int j=nums.length-1;
    while (i<j){
        if (nums[i]+nums[j]<k){
            i++;
        } else if (nums[i]+nums[j]>k) {
            j--;
        }else {
            i++;
            j--;
            pc++;
        }
    }
    return pc;
    }
}
