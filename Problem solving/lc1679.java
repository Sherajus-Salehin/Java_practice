public class lc1679 {
    public int maxOperations(int[] nums, int k) {
        int i=0;
        int j=0;
        int l= nums.length;
        boolean [] visited=new boolean[l];
        int pc=0;
        for(i=0;i<l-1;i++){
            for (j=i+1;j<l;j++){
                if(!visited[i] && !visited[j] && nums[i]+nums[j]==k){
                    visited[i]=true;
                    visited[j]=true;
                    pc++;
                }

            }
        }
    return pc;
    }
}
