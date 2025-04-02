//given a number findout if its power of 23 or not;
// 10000 -- is power as only 1 one;
// 10101-- not power of 2 if more than 1 ones; 
public class a10_powerof2 {
    public static void main(String[] args) {
       int n=16;
       boolean ans=(n&(n-1))==0;
        System.out.println(ans);
    }
}
