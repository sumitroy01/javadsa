//if the nth bit is 0 set 1 or if nth bit is 1 set 0;

public class a6_resetbit {
    public static void main(String[] args) {
            int num =10;
            int n=3;
            reset(num,n);
            System.out.println(Integer.toBinaryString(14));// works fine man
    }
    static void reset(int num,int n){
        int mask =1<<n-1;
        if ((num&mask)==0) {
            int otp=num |mask;
            System.out.println(otp);
        }else{
            int opt2=num^mask;
            System.out.println(opt2);
        }
    }
}
