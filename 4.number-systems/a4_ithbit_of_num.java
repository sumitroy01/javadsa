//find the ith bit of a number eg 

public class a4_ithbit_of_num {
    public static void main(String[] args) {
        int num =9;
        int n=5;
        System.out.println(findbits(n, num)
        

        );

    }

    static int findbits(int n,int num){
            
        int mask =num>>n-1;
        //int bit= (num & mask)==0?0:1 ;
        int bit=mask&1;
        return bit;
        //0
    }
    
}
