class lc1071 {
    public String gcdOfStrings(String str1, String str2) {
        String swap="";
        String ret;
        String ret2="";
        String t="";
        if (str1.length()< str2.length()) {
            swap=str1;
            str1=str2;
            str2=swap;
        }
        int s1l = str1.length();
        int s2l = str2.length();

        for(int i=s2l;i>0;i--) {
            //str1=swap;
            t = str2.substring(0, i);
            ret=str1.replaceAll(t,"");
            ret2=str2.replaceAll(t,"");
            //System.out.println(t+" "+ret);
            if(ret.isEmpty() && ret2.isEmpty()){
                return t;
            }
        }
        return "";
    }

}
