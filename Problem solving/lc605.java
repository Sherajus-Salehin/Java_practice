public class lc605 {

    //failed
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int s=flowerbed.length;
        int mp=s/2; //max possible
        int ap=0; //already planted
        boolean io=false;
        boolean ie=false;
        for(int i=0;i<s;i+=2){
            if (flowerbed[i]==1){
                io=true;
                break;
            }
        }
        for(int i=1;i<s;i+=2){
            if (flowerbed[i]==1){
                ie=true;
                break;
            }
        }
        if((s%2!=0 && io && !ie) || (!io && !ie && s%2!=0))
            mp++;

        if (s%2==0 && io && ie)
            mp-=1;
        for(int c:flowerbed)
            ap+=c;

         System.out.println("s: "+s+" io: "+io+" ie: "+ie+" mp: "+mp+" ap: "+ap+" diff: "+(mp-ap));
        return ((mp-ap)>n);

    }
}
