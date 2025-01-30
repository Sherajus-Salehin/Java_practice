class lc1071v2 {
    public String gcdOfStrings(String str1, String str2) {
        String swap="";
        String ret;
        String s="";
        String t="";
        if (str1.length()< str2.length()) {
            swap=str1;
            str1=str2;
            str2=swap;
        }
        int s1l = str1.length();
        int s2l = str2.length();

        for(int i=1;i<=s2l;i++) {
            //str1=swap;
            t = str2.substring(0, i);
            ret=str1.replaceAll(t,"");
            //System.out.println(t+" "+ret);
            if(ret.isEmpty()){
                return t;
            }
        }
        return s;
    }

}
