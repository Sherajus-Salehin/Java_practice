import java.util.ArrayList;
import java.util.List;
public class lc2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                l1.add(i);
            }
        }


        return l1;
    }
}
