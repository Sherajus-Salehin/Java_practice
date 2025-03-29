public class lc11 {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxW=0;
        while (i!=j){
            int hi=height[i];
            int hj=height[j];
            if(hi<hj){
                maxW=Math.max(maxW,((j-i)*hi));
                i++;
            }else{
                maxW=Math.max(maxW,((j-i)*hj));
                j--;
            }
        }

        //calculate i==j seperately
        return maxW;
    }
}
