//lc2658
public class TrRain {
    public static void main(String[] args) {
        //lc407
        int [][] H={{5,5,5,1},{5,1,1,5},{5,1,5,5},{5,2,5,8}};
        //System.out.println(H[2][2]);
        int l=H.length;
        int w=H[0].length;
        //add counter
        int v=0;
        //outer loop for arrays
        int ll=l-1;
        int wl=w-1;
        int mem=401;
        for(int i = 1; ll > i; i++){
            //inner loop for elements
            for(int j=1;j<wl;j++){
                //L,R,F,B checkup
                int lm=0;
                int rm=0;
                int fm=0;
                int bm=0;
                for(int k=i+1;k<l;k++){
                    if(H[k][j]>lm){
                        lm=H[k][j];
                    }
                }
                for(int k=0;k<i;k++){
                    if(H[k][j]>rm){
                        rm=H[k][j];
                    }
                }
                for(int k=j+1;k<w;k++){
                    if(H[i][k]>fm){
                        fm=H[i][k];
                    }
                }
                for(int k=0;k<j;k++){
                    if(H[i][k]>bm){
                        bm=H[i][k];
                    }
                }
                //max,min
                //counter calculation
                int cn=Math.min(Math.min(lm,rm),Math.min(fm,bm));
                if (cn>mem){
                    cn=mem;
                }
                System.out.println("cn: "+cn);
                if(cn>H[i][j] && cn<=mem){
                    int diff=mem-cn;
                    System.out.println(" cn:"+cn+" mem: "+mem+" diff: "+diff);
                    if(diff>200){
                        mem=cn;
                        diff=0;
                    }
                    mem=cn;
                    v+=(cn-H[i][j]-diff);
                    System.out.println(" cn:"+cn+" mem: "+mem+" diff: "+diff);
                    diff=0;

                }

//                if(cn>H[i][j]){
//                    //v=v+(cn-H[i][j]);
//                   // System.out.println(cn+" "+v);
//
//                }


            }

        }
        System.out.println(v);

    }
}
