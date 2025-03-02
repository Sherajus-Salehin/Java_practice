import java.util.ArrayList;

public class lc345 {
    public String reverseVowels(String s) {
        char [] ch=s.toCharArray();
        ArrayList <Character> vowels=new ArrayList<>();
        ArrayList<Integer> pos=new ArrayList<>();
        int i=0;
        for(char c:ch){
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='I'||c=='i'||c=='o'||c=='O'||c=='u'||c=='U'){
                vowels.add(c);
                pos.add(i++);
            }else i++;
        }
        int ps=pos.size();
        int vs=ps-1;
        for(int j=0;j<ps;j++){
            ch[pos.get(j)]=vowels.get(vs-j);
        }

    return String.valueOf(ch);
    }

}
