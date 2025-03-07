
public class lc443 {
    String s="";
    char [] ch;
    public int compress(char[] chars) {
        int l= chars.length;
        if(l==1)
            return 1;
        int cc=1;
        int i=0;
        int wi=0;
        for(i=0;i<l-1;i++){
            if (chars[i]==chars[i+1])
                cc++; //   if ((chars[i]==chars[i+1]) && i!=l-2)

            else {
//                if(i==l-2 && chars[l-1]==chars[l-2])
//                    cc++;
                if(cc==1){
                    //s += String.valueOf(chars[i]);
                    chars[wi++]=chars[i];
                }
                else if (cc<10){
                    //s += String.valueOf(chars[i]);
                    chars[wi++]=chars[i];
                    chars[wi++]=(char) (cc+'0') ;
                    //s = s + String.valueOf(cc);
                    cc=1;
                }
                else {
                    chars[wi++]=chars[i];
                   // chars[wi++]=s[0];
                    for(int k=String.valueOf(cc).length()-1;k>=0;k--){
                        int d=(int)Math.pow(10,k);
                        int n=cc/d;
                        chars[wi++]= (char) (n+'0');
                        cc-=d*n;
                    }
                    cc=1;
                }
            }
        }

//
        if(cc==1){
            //s += String.valueOf(chars[i]);
            chars[wi++]=chars[i];
        }

        else if (cc<10){
            //s += String.valueOf(chars[i]);
            chars[wi++]=chars[i];
            chars[wi++]=(char)(cc+'0') ;
            //s = s + String.valueOf(cc);
            cc=1;
        }
        else {
            chars[wi++]=chars[i];
            // chars[wi++]=s[0];
            for(int k=String.valueOf(cc).length()-1;k>=0;k--){
                int d=(int)Math.pow(10,k);
                int n=cc/d;
                chars[wi++]= (char) (n+'0'); //0 is has unicode value 48. so,
                cc-=d*n;
            }
            cc=1;
        }
        ch=chars;
        return wi;
    }
}
