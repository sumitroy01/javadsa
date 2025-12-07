import java.util.*;
public class btowstacksgame {
    static int twostacks(int x,int[] a,int[] b){
        return twostacks(x, a, b,0,0)-1;
    }
    private static int twostacks(int x,int[] a,int[]b,int sum,int count){
        if (sum>x){
            return count;
        }

        int ans1=twostacks(x,Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
        int ans2=twostacks(x,a,Arrays.copyOfRange(b,1,b.length),sum+a[0],count+1);

        return Math.max(ans1,ans2);
    }
}
