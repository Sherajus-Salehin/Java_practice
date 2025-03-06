public class lt151 {
    public String reverseWords(String s) {
        String m=s.trim();
        String [] words=m.split(" ");
        int l=words.length-1;
        m=words[l];
        for(int i=l-1;i>=0;i--){
            if (!words[i].isBlank())
                m = m + (" " + words[i]);
        }
        return m;
    }
}
