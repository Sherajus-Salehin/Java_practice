import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc869 {
    List<Integer> perms=new ArrayList<>();
    public boolean reorderedPowerOf2(int n) {
        perms.add(n);
        String x=String.valueOf(n);
        int r=x.length();
        if(r==1) return isPowerOfTwo(n);
        char[] xAr=x.toCharArray();
        permute(xAr,0,r-1);
        for (int t:perms){
            System.out.println(t);
            if(isPowerOfTwo(t))
                return true;
        }
        return false;
    }

    void permute(char[]ar, int l, int r){
        if (l==r && ar[0] != '0'){
            perms.add(Integer.parseInt(new String(ar)));
            return;
        }
        for(int i=l;i<=r;i++){
                swap(ar,l,i);
                permute(ar,l+1,r);
                swap(ar,l,i);
        }
    }
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }




    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        double x=Math.log(n)/Math.log(2);
        return Math.abs(x - Math.round(x)) < 1e-10;
    }
}
