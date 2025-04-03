public class a1_primenumber {
public static void main(String[] args) {
    //brute force solutions....
    int num=6;
    boolean status=true;
    for (int i = 2; i < num; i++) {
        if (num%i==0) {
            status=false;
        }
        
    }
    System.out.println(status);
}

//optimized solution ..
//c=2  ----- c*c =   2*2 =4 if num is divisible by 4 then its also by 2 , same as 3*3 =27 if num dividble same 
static boolean isprime(int num){
    if(num<=1){
        return false;
    }
     int c=2;
     while(c*c<=num){
        if (num%c==0) {
            return false;
        }
        c++;
     }
     return true;
}

}