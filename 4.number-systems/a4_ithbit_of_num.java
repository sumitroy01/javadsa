//find the ith bit of a number eg 

public class a4_ithbit_of_num {
    public static void main(String[] args) {
        int num =10;
        int n=3;
        System.out.println(findbits(n, num)
        

        );

    }

    static int findbits(int n,int num){
            
        int mask =1<<n-1;
        int bit= (num & mask)==0?0:1 ;
        return bit;

    }
    
}
