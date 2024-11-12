package Palindrome.trials;
import java.util.Arrays;
import java.util.Scanner;
public class recursive {
    public static void main(String[]ar){
        Scanner s=new Scanner(System.in);
        String word= s.next();
        char[]words=word.toCharArray();
        int l=words.length;
        for (int i=2;i<=l;i++){
            if(i%2==0){
                int j=0;
                while (j<=l-i){
                    IsPalindrome.IsEPalindrome(Arrays.copyOfRange(words,j,j+i));
                    j+=i;
                }

            }else {
                int j=0;
                while (j<=l-i){
                    IsPalindrome.IsEPalindrome(Arrays.copyOfRange(words,j,j+i));
                    j+=i;
                }
            }
        }
    }
}
