public class lc1910 {
    String m,p;
    public String removeOccurrences(String s, String part) {
        m=s;
        p=part;
        replacer();
    return m;
    }
    void replacer(){
        if(m.contains(p)){
            m=m.replaceAll(p,"");
            replacer();
        }
    }
}
