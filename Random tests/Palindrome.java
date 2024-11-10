import java.util.Scanner;
public class Palindrome {
    public static void main(String[]ar){
        Scanner s= new Scanner(System.in);
        String word= s.next();
        char [] words=word.toCharArray();
        int l=word.length();
        if(l>1){
            for (int i=1;i<l;i++){
                int j=i-1;
                int n=1;
                if (i<l/2){
                    while (j>=0){
                        if(words[j]==words[i+n]){
                            for (int c=j;c<=i+n;c++) System.out.print(words[c]);
                            System.out.println();
                            n++;
                        }
                        j--;
                    }
                }else {
                    while (j>=l/2){
                        if(i+n!=l){
                            if(words[j]==words[i+n]){
                                for (int c=j;c<=i+n;c++) System.out.print(words[c]);
                                System.out.println();
                                n++;
                            }

                        }
                        j--;
                    }
                }
            }
        }
    }
}
