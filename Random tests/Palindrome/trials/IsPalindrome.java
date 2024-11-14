package Palindrome.trials;
public class IsPalindrome {
    static boolean p=false;
    static void check(char[] c){
        p=false;
        int i=0;
        int j=c.length;
        if(j%2==0) IsEPalindrome(c,i,(j-1));
        else IsOPalindrome(c,i,(j-1));
        if(p){
            for (char item:c){
                System.out.print(item);
            }System.out.println();
        }
    }

    static void IsEPalindrome(char[] e, int i, int j) {
        if(e[i]==e[j]){
            if(i==(j+1)){
                p=true;
                return;
            }
            i++;j--;
            IsEPalindrome(e,i,j);
        }
    }

    static void IsOPalindrome(char[] o, int i, int j) {
        if(o[i]==o[j]){
            if(i==j){
                p=true;
                return;
            }
            i++;j--;
            IsOPalindrome(o,i,j);
        }
    }
}
