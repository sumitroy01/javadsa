//find a power b
public class a13_apowerB {
    public static void main(String[] args) {
        //sol1:
        int number=3;
        int power=2;
        int res=number;
        for (int i = 1; i <power; i++) {
            res*=number;
            
        }
        System.out.println(res);
    
    //sol 2 ;
    int base=number;
    int ans=1;
    while (power>0) {
        if((power&1)==1){
            ans*=base;
        }else{
            base*=base;
            power>>=1;
        }}        
    System.out.println(ans+" : ans 2");



    
    }}
