public class lc2342 {
    public int maximumSum(int[] nums) {
        int maxS=-1;
        int nl=nums.length;
        if(nl==1)
            return -1;
        //{4,6,10,6}
        for(int i=0;i<nl;i++){
            for(int j=nl-1;j>i;j--){
                int n1=nums[i];
                int n2=nums[j];
                int s1=sumNum(n1);
                int s2=sumNum(n2);
                if ( n1!=n2 && s1==s2){
                   maxS=Math.max(maxS,(n1+n2));
                }
            }
        }
        return maxS;
    }
    int sumNum(int n){
        int s=0;
        int l=(int)(Math.log10(n));
        if(l==0)
            return n;
        while(n>0){
            s+=n%10;
            n/=10;
        }

    return s;
    }
}

//public int maximumSum(int[] nums) {
//    int maxSum=-1;
//    int n=nums.length;
//    Map<Integer, Integer> digitSumMap = new HashMap<>();
//    for (int num : nums) {
//        digitSumMap.put(num, sumNum(num));
//    }
//
//    Map<Integer, Integer> sumMaxValueMap = new HashMap<>();
//
//    for (int num : nums) {
//        int digitSum = digitSumMap.get(num);
//        if (sumMaxValueMap.containsKey(digitSum)) {
//            maxSum = Math.max(maxSum, sumMaxValueMap.get(digitSum) + num);
//            sumMaxValueMap.put(digitSum, Math.max(sumMaxValueMap.get(digitSum), num));
//        } else {
//            sumMaxValueMap.put(digitSum, num);
//        }
//    }
//
//    return maxSum;
//}
//int sumNum(int n){
//    int s=0;
//    while(n>0){
//        s+=n%10;
//        n/=10;
//    }
//
//    return s;
//
//
//}
//}
