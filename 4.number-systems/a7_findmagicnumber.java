// eg num=4 binary -->100  --> (5p0 *0)+(5p1*0)+(5p2*1)=25
public class a7_findmagicnumber {
    public static void main(String[] args) {
        int num=6;
        System.out.println(magicnum(num));

    }
    static int magicnum(int num){
        int ans=0;
        int base=5;
        while(num>0){
            int last=num&1;
            num=num>>1;
            ans+=last*base;
            base=base*5;

        }
        return ans;
    }
}
