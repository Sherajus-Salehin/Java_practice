import java.util.Arrays;
public class lc1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();
        int c1l=c1.length;
        for(int i=0;i<c1l;i++){
            for(int j=c1l-1;j>i;j--){
                char temp=c2[i];
                c2[i]=c2[j];
                c2[j]=temp;
                if(Arrays.equals(c1,c2))
                    return true;
                else {
                    c2[j]=c2[i];
                    c2[i]=temp;
                }
            }
        }

    return false;
    }
}
