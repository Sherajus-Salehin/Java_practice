public class lc392 {
    char [] sc;
    char [] tc;
    int cr=0;
    public boolean isSubsequence(String s, String t) {
        int l=s.length();
        if(l==t.length())
            return s.equals(t);
        sc=s.toCharArray();
        tc=t.toCharArray();
        for(int i=0;i<l;i++){
            cr=charFinder(sc[i],cr);
            if(cr==-1){
                return false;
            }
            cr++;
        }
        return cr!=-1;
    }
    int charFinder(char c,int x){
        for(int j=x;j<tc.length;j++){
            if(tc[j]==c) {
                return j;
            }
        }
        return -1;
    }
}
