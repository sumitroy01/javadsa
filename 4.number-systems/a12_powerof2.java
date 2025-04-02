//given a number findout if its power of 23 or not;
// 10000 -- is power as only 1 one;
// 10101-- not power of 2 if more than 1 ones; 
public class a12_powerof2 {
    public static void main(String[] args) {
       int n=16;
       boolean ans=(n&(n-1))==0;
        System.out.println(ans);
    }
}
// we know n-1 suppose n=100 then n-1= 011  so when we do 100 & 011  we get 000 hence power of 2
                    