import java.util.TreeMap;

public class lc2570 {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> ids=new TreeMap<>();
        for(int[]a:nums1)
            ids.put(a[0],a[1]);
        for (int[]b:nums2){
            if (ids.containsKey(b[0])){
                ids.replace(b[0],(ids.get(b[0])+b[1]));
            }else ids.put(b[0],b[1]);
        }
        int is=ids.size();
        int[][] res=new int[is][];
        int i=0;
        for(int key:ids.keySet()){
            res[i][0]=key;
            res[i][1]=ids.get(key);
            i++;
        }

    return res;
    }
}
