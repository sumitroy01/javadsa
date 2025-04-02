public class a14_noofsetbits {
    public static void main(String[] args) {
        int num=10;
        
        int count=0;
        while (num>0) {
            if ((num&1)!=0) {
                count+=1;
           
              num= num>>1;
            }else{
                num=num>>1;
            }
            
        }
        System.out.println(count);
    }
    
}
